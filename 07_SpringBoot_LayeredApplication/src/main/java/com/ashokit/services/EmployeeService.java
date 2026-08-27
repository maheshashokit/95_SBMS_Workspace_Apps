package com.ashokit.services;

import com.ashokit.beans.Employee;

import java.util.List;

public interface EmployeeService {

    void createBrandNewEmployee(Employee employee);

    void createBrandNewEmployees(List<Employee> employeeList);
}
