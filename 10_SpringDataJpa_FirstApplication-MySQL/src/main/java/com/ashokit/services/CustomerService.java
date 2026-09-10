package com.ashokit.services;

import com.ashokit.entity.Customer;

import java.util.List;

public interface CustomerService {

    public Customer createBrandNewCustomer(Customer customer);

    //creating bulk of new customers
    public Iterable<Customer> creatingNewBrandCustomers(List<Customer> customers);

    //Fetching customerDetails based on the customerId
    public Customer findCustomerById(Integer customerId);

    //Fetching all customer Details
    public Iterable<Customer> fetchAllCustomers();
}
