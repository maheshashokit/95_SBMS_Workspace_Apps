package com.ashokit.util;

import com.ashokit.beans.Employee;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeUtils {

    public List<Employee> getAllEmployeesInfo(){

        List<Employee> employeeList = new ArrayList<>();

        //write logic to read data from ashokit_employees.txt
        //try-with-resources
        try(FileReader fr = new FileReader("src/main/resources/ashokit_employees.txt");
            //Reading file data as line by line
            BufferedReader br = new BufferedReader(fr);
           ){
            
            //Actual Logic
            String currentRecord;
            while((currentRecord = br.readLine()) !=null){
                //getting current Record and split based comma(,)
                String[] employeeInfo = currentRecord.split(",");

                Integer empId  = Integer.parseInt(employeeInfo[0]);
                String empName = employeeInfo[1];
                String emailId = employeeInfo[2];

                //Add this Employee information to employeeList object
                employeeList.add(new Employee(empId,emailId,empName));
            }
        }catch (Exception em){
            em.printStackTrace();
        }

        return employeeList;
    }
}
