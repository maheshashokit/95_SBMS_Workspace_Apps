package com.ashokit.services;

import com.ashokit.beans.Employee;
import com.ashokit.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void createBrandNewEmployee(Employee employee) {
        boolean employeeStatus = employeeDao.createEmployee(employee);
        if(employeeStatus){
            System.out.println("Employee Onboarded Successfully");
        }else{
            System.out.println("Employee Not Onboarded");
        }
    }

    @Override
    public void createBrandNewEmployees(List<Employee> employeeList) {
        int employees = employeeDao.createEmployees(employeeList);
        if(employeeList.size() == employees){
            System.out.println("All Employees Onboarded Successfully..");
        }else{
            System.out.println("Some of employees missing for Onboarding");
        }
    }
}
