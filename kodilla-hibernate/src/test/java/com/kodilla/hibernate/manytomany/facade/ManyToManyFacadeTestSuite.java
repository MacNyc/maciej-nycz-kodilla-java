package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class ManyToManyFacadeTestSuite {
    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void findCompanyTest() {

        final String s = "Car";

        //Given
        Company carphoneWarehouse = new Company("Carphone Warehouse");
        Company carPainting = new Company("Car Painting");
        Company carMatter = new Company("Car Matter");

        List<Company> companies = new ArrayList<>();
        companies.add(companyDao.save(carphoneWarehouse));
        companies.add(companyDao.save(carPainting));
        companies.add(companyDao.save(carMatter));

        // When
        List<Company> found = manyToManyFacade.findCompanyByNameFragment(s);

        //Then
        Assert.assertEquals(carMatter, found.get(0));
    }

    @Test
    public void findEmployeeTest() {
        final String lastname = "Doo";

        //Given
        Employee maciejNycz = new Employee("Maciej", "Nycz");
        Employee mariaNycz = new Employee("Maria", "Nycz");
        Employee scobbyDoo = new Employee("Scooby", "Doo");

        employeeDao.save(scobbyDoo);

        //When & Then
        Assert.assertEquals(scobbyDoo, manyToManyFacade.findEmployeeByLastNameFragment(lastname).get(0));
    }
}