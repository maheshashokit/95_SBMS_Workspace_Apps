package com.ashokit.services;

import com.ashokit.entity.Customer;

import java.util.List;

public interface CustomerService {

    //Method for Fetching records based on supplied PageNo
    public List<Customer> getCustomerInfo(int pageNo, int pageSize);

    //Method for Fetching all the page of Records
    public void getCustomerInfo();

    //Method for saving customers information for dummy data
    public Iterable<Customer> saveAllCustomers(List<Customer> customers);
}
