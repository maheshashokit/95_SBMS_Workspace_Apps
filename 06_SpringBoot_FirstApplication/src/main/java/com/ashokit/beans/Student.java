package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Mahesh")
    private String name;

    @Value("SpringBoot")
    private String courseName;

    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", address=" + address +
                '}';
    }
}
