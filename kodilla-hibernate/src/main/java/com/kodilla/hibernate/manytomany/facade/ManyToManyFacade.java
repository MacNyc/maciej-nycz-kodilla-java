package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);


    public List<Company> findCompanyByNameFragment(String s) {
        List<Company> result = null;
        if (s == null) {
            LOGGER.error(MTMProcessingException.ERR_NULL_FRAGMENT);
        } else {
            LOGGER.info("Finding companies with name containing: " + s);
            try {
                result = companyDao.retrieveCompaniesWithPartOfName(s);
            } catch (RuntimeException e) {
                LOGGER.error(MTMProcessingException.ERR_UNEXPECTED, e);
            }
        }
        return result;
    }

    public List<Employee> findEmployeeByLastNameFragment(String s) {
        List<Employee> result = null;
        if (s == null) {
            LOGGER.error(MTMProcessingException.ERR_NULL_FRAGMENT);
        } else {
            LOGGER.info("Finding employee with name containing: " + s);
            try {
                result = employeeDao.retrieveEmployeesWithLastName(s);
            } catch (RuntimeException e) {
                LOGGER.error(MTMProcessingException.ERR_UNEXPECTED, e);
            }
        }
        return result;
    }
}
