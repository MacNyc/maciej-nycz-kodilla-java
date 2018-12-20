package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);
        dataMaesters.getEmployees().add(stephanieClarckson);
        stephanieClarckson.getCompanies().add(dataMaesters);
        dataMaesters.getEmployees().add(lindaKovalsky);
        lindaKovalsky.getCompanies().add(dataMaesters);
        greyMatter.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(greyMatter);
        greyMatter.getEmployees().add(lindaKovalsky);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

    }

    @Test
    public void CompaniesWithThreeFirstLetters() {
        final String threeLetters = "Ca2";

        //Given
        Employee maciejNycz = new Employee("Maciej", "Nycz");
        Employee mariaNycz = new Employee("Maria", "Nycz");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company carphoneWarehouse = new Company("Carphone Warehouse");
        Company carPainting = new Company("Car Painting");
        Company carMatter = new Company("Ca2 Matter");

        carphoneWarehouse.getEmployees().add(maciejNycz);
        maciejNycz.getCompanies().add(carphoneWarehouse);
        carPainting.getEmployees().add(mariaNycz);
        mariaNycz.getCompanies().add(carPainting);
        carPainting.getEmployees().add(lindaKovalsky);
        lindaKovalsky.getCompanies().add(carPainting);
        carMatter.getEmployees().add(maciejNycz);
        maciejNycz.getCompanies().add(carMatter);
        carMatter.getEmployees().add(lindaKovalsky);
        lindaKovalsky.getCompanies().add(carMatter);

        List<Integer> ids = new ArrayList<>();
        ids.add(companyDao.save(carphoneWarehouse).getId());
        ids.add(companyDao.save(carPainting).getId());
        ids.add(companyDao.save(carMatter).getId());

        //When & Then
        Assert.assertEquals(carMatter,
                companyDao.retrieveCompaniesWithThreeFirstLetters(threeLetters).get(0));
    }

    @Test
    public void EmployeesWithLastName() {
        final String lastJaromin = "Jaromin";

        //Given
        Employee andrzejJaromin = new Employee("Andrzej", "Jaromin");


        employeeDao.save(andrzejJaromin);


        //When & Then
        Assert.assertEquals(andrzejJaromin, employeeDao.retrieveEmployeesWithPartOfName(lastJaromin).get(0));


    }
}