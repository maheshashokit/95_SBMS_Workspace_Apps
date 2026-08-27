package com.ashokit;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.ashokit.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

//(@SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan)
//@SpringBootConfiguration annotation is child annotation for @Configuration
//@Configuration -> Spring & SpringBoot, @SpringBootConfiguration -> springBoot
@SpringBootApplication

//single properties file
//@PropertySource(value="test.properties")

//multiple properties file
@PropertySources({@PropertySource(value = "test1.properties"),
		          @PropertySource(value = "test.properties")
                 })
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Student student = context.getBean(Student.class);
		System.out.println(student);

		Address address = context.getBean(Address.class);
		System.out.println(address);

		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		System.out.println(employeeBean);


	}

	@Bean
	public CommandLineRunner testRunner(){
		return (String... arg)->{
			System.out.println("Lambda expression:::"+ Arrays.toString(arg));
		};
	}

	@Bean
	public ApplicationRunner testAppRunner(){
		return (args) ->{
			System.out.println("ApplicationRunner = " +args.getNonOptionArgs());
			Set<String> optionNames = args.getOptionNames();
			optionNames.forEach(eachOptionName ->{
				List<String> optionValues = args.getOptionValues(eachOptionName);
				System.out.println(eachOptionName + "====" +optionValues);
			});
		};
	}
}
