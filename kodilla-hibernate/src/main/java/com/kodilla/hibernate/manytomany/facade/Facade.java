package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> returnEmployee(String employeeName){
        return employeeDao.findLastNameByFewLetters(employeeName);
    }

    public List<Company> returnCompanyName(String companyName){
        return companyDao.returnCompanyName(companyName);
    }


    @Override
    public String toString() {
        return "Facade{" +
                "employeeDao=" + employeeDao +
                ", companyDao=" + companyDao +
                '}';
    }
}
