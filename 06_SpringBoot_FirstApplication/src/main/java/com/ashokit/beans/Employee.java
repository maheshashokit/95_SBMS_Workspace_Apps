package com.ashokit.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${emplId}")
    private String employeeId;

    @Value("${empName}")
    private String name;

    @Value("${salary}")
    private float salary;

    @Value("${designation}")
    private String designation;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
