package com.ashokit.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Employee:::"+ Arrays.toString(args));
    }
}
