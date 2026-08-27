package com.ashokit.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties(prefix = "com.ashokit")
public class EmployeeBean {

    private String id;

    private String name;

    private float salary;

    private Address address;

    private String[] colors;

    public void setId(String id) {
        System.out.println("Inside the setId method");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("Inside the setName method");
        this.name = name;
    }

    public void setSalary(float salary) {
        System.out.println("Inside the setSalary method");
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", colors="
                + Arrays.toString(colors) + "]";
    }
}
