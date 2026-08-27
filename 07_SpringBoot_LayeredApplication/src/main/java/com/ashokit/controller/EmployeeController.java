package com.ashokit.controller;

import com.ashokit.beans.Employee;
import com.ashokit.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void createNewEmployee(Employee employee){
        employeeService.createBrandNewEmployee(employee);
    }

    public void createNewEmployees(List<Employee> employees){
        employeeService.createBrandNewEmployees(employees);
    }
}