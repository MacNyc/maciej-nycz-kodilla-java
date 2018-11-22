package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testSave() {
        // Given
        int pid1 = productDao.save(new Product("Bread")).getId();
        int pid2 = productDao.save(new Product("Butter")).getId();
        int pid3 = productDao.save(new Product("Cheese")).getId();

        Invoice invoice = new Invoice("F/1/2018");
        List<Item> items = invoice.getItems();
        Item item1 = new Item(productDao.findOne(pid1), new BigDecimal("3.20"), 3);
        items.add(item1);
        item1.setInvoice(invoice);
        Item item2 = new Item(productDao.findOne(pid2), new BigDecimal("4.60"), 1);
        items.add(item2);
        item2.setInvoice(invoice);
        Item item3 = new Item(productDao.findOne(pid3), new BigDecimal("5.35"), 2);
        items.add(item3);
        item3.setInvoice(invoice);

        // When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        List<Item> itemsFromSavedInvoice = invoice.getItems();


        // Then
        assertEquals(3, items.size());
        assertEquals(3, itemsFromSavedInvoice.size());
        assertEquals(item1, items.get(0));
        assertEquals(item2, items.get(1));
        assertEquals(item3, items.get(2));
        assertEquals(item1, itemsFromSavedInvoice.get(0));
        assertEquals(item2, itemsFromSavedInvoice.get(1));
        assertEquals(item3, itemsFromSavedInvoice.get(2));

        //CleanUp
        invoiceDao.delete(id);
        productDao.delete(pid1);
        productDao.delete(pid2);
        productDao.delete(pid3);
    }
}
