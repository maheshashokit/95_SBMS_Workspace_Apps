package com.ashokit.services;
import com.ashokit.Employee;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public List<Employee> getEmployees(){
		
		Employee e  = new Employee("AIT123","Mahesh","Hyderabad");
		Employee e1 = new Employee("AIT456","Suresh","Chennai");
		Employee e2 = new Employee("AIT789","Rajesh","Bangalore");
		Employee e3 = new Employee("AIT111","Nagesh","Hyderabad");
		Employee e4 = new Employee("AIT122","Surya","Chennai");
		Employee e5 = new Employee("AIT133","Kumar","Hyderabad");
		
		return List.of(e,e1,e2,e3,e4,e5);
	}

}
