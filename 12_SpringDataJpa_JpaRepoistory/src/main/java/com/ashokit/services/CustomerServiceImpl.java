package com.ashokit.services;

import com.ashokit.entity.Customer;
import com.ashokit.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    //Injecting the DAO Object
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer createNewBrandCustomerUsingSaveAndFlush(Customer customer) {

        //We are using JPARepoistory interface methods
        return customerDao.saveAndFlush(customer);
    }

    @Override
    public void terminateCustomers(List<Integer> customerIds) {
        //We are using JPARepoistory interface methods
        customerDao.deleteAllByIdInBatch(customerIds);
    }

    @Override
    public Customer fetchCustomerDetailsById(Integer customerId) {
        //We are using JPARepoistory interface methods
        //If supplied customerId is not present will throw an EntityNotFoundException
        return customerDao.getReferenceById(customerId);
    }

    @Override
    public void fetchAllCustomers(Customer customer) {

        //We are using JPARepoistory interface methods
        List<Customer> allCustomers = customerDao.findAll(Example.of(customer),Sort.by(Sort.Direction.DESC,"customerName"));

        //processing the collection
        allCustomers.forEach(System.out::println);
    }
}
