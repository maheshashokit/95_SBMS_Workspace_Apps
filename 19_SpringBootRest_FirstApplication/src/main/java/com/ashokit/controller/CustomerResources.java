package com.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.dto.Customer;
import com.ashokit.util.CustomerUtils;

@RestController
@RequestMapping("/api/customers")
public class CustomerResources {
	
	@Autowired
	private CustomerUtils customerUtils;
	
	@GetMapping("/")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<List<Customer>>(customerUtils.getAllCustomers(),HttpStatus.OK);
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<?> getCustomerById(@PathVariable("customerId") String customerId){
		List<Customer> allCustomers  = customerUtils.getAllCustomers();
		
		//filter the customer details based on pathvariable value
		Optional<Customer> customerDetails = 
				allCustomers.stream().filter(eachCustomer -> customerId.equalsIgnoreCase(eachCustomer.getId()))
				.findFirst();
		
		if(customerDetails.isPresent()) {
			return new ResponseEntity<Customer>(customerDetails.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Given CustomerId details were not found",HttpStatus.OK);
		}		
	}
	
	
	@PostMapping(value="/", consumes= {"application/json","application/xml"}, produces = {"application/json","application/xml"})
	public ResponseEntity<?> createCustomer(@RequestBody Customer customer){		
		Optional<Customer> customerDetails = Optional.ofNullable(customer);
		String customerId = "";
		if(!customerDetails.isEmpty()) {
			customerId = customerDetails.get().getId();
		}
		return new ResponseEntity<String>(customerId+ "Customer Created Successfully", HttpStatus.CREATED);
	}
}
