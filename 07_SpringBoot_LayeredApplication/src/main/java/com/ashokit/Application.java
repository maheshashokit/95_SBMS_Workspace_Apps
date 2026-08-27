package com.ashokit;

import com.ashokit.controller.EmployeeController;
import com.ashokit.util.EmployeeUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeController employeeController = context.getBean(EmployeeController.class);
		EmployeeUtils employeeUtils = context.getBean(EmployeeUtils.class);

		employeeController.createNewEmployee(employeeUtils.getAllEmployeesInfo().get(0));
		employeeController.createNewEmployees(employeeUtils.getAllEmployeesInfo());
	}
}