package com.ashokit.service;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Transactional
    public void getCustomerNameById(Integer customerId){
        String customerName = customerDao.fetchCustomerNameById(customerId);
        System.out.println("Customer Name::::" + customerName);
    }

    @Transactional
    public void getCustomerDetailsById(Integer customerId){
        Map<String, Object> customerInfo = customerDao.fetchCustomerDetailsById(customerId);
        System.out.println("customerInfo = " + customerInfo);
    }

    @Transactional
    public void getCustomerInfoById(Integer customerId){
        Customer customer = customerDao.fetchCustomerDetailsByCustomerId(customerId);
        System.out.println("customer = " + customer);
    }

    @Transactional
    public void getAllCustomers(){
        List<Customer> allCustomers = customerDao.getAllCustomers();
        allCustomers.forEach(System.out::println);
    }
}