package com.ashokit.spring.config;

import com.ashokit.spring.beans.Address;
import com.ashokit.spring.beans.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

//Reading properties file by the spring container
@PropertySource(value = {"applicationConfig.properties","test.properties"})
public class StudentConfig {

    @Value("${student.name}")
    private String name;

    @Value("${student.courseName}")
    private String courseName;

    @Value("${student.city}")
    private String cityName;

    //Defining student Bean using constructor injection
    //@Bean Annotated Method -> <bean> tag in xml file
    @Bean
    public Student getStudentBean(){
        // return new Student("Mahesh","SpringBoot", "Hyderabad");
        return new Student(name,courseName, cityName, getAddressBean());
    }

    //Defining student Bean using constructor injection
    //@Bean Annotated Method -> <bean> tag in xml file
    @Bean
    public Address getAddressBean(){
        Address address = new Address();
        address.setDoorNo("1-2-3");
        address.setStreetName("XYZ");
        address.setCity("Hyderabad");
        return address;
    }
}
