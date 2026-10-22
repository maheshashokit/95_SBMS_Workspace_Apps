package com.ashokit.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ashokit.dto.Customer;

@Component
public class CustomerUtils {

	public List<Customer> getAllCustomers(){
		
		Customer cust1 = new Customer("AIT123","Mahesh","Hyderabad");
		Customer cust2 = new Customer("AIT345","Suresh","Bangalore");
		Customer cust3 = new Customer("AIT567","Rajesh","chennai");
		Customer cust4 = new Customer("AIT778","Ramesh","Mumbai");
		Customer cust5 = new Customer("AIT898","Nagesh","Hyderabad");
		Customer cust6 = new Customer("AIT147","Yagnesh","chennai");
		Customer cust7 = new Customer("AIT158","Kumar","Hyderabad");
		Customer cust8 = new Customer("AIT169","Venkatesh","Mumbai");
		
		
		return List.of(cust1,cust2,cust3,cust4,cust5,cust6,cust7,cust8);
		
	}
}
