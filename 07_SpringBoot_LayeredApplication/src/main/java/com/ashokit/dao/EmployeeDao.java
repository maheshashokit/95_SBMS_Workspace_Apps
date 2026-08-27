package com.ashokit.dao;

import com.ashokit.beans.Employee;

import java.util.List;

public interface EmployeeDao {

    boolean createEmployee(Employee emp);

    int createEmployees(List<Employee> emps);
}
