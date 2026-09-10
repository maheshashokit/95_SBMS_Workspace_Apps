package com.ashokit.controller;

import com.ashokit.entity.Customer;
import com.ashokit.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void createNewCustomer(Customer customer) {
        Customer customerDetails = customerService.createBrandNewCustomer(customer);
        if(Objects.nonNull(customerDetails)) {
            System.out.println("Customer Created SuccessFully.....");
            System.out.println(customerDetails);
        }else {
            System.out.println("Customer Not Created......");
        }
    }

    public void createNewCustomers(List<Customer> customers){
        Iterable<Customer> newBrandCustomers = customerService.creatingNewBrandCustomers(customers);
        //processing newBrandCustomers
        newBrandCustomers.forEach(System.out::println);
    }

    public void fetchCustomerDetailsById(Integer customerId){
        Customer customer = customerService.findCustomerById(customerId);
        System.out.println("customer = " + customer);
    }

    public void fetchAllCustomerDetails(){
        Iterable<Customer> allCustomers = customerService.fetchAllCustomers();
        allCustomers.forEach(System.out::println);
    }
}