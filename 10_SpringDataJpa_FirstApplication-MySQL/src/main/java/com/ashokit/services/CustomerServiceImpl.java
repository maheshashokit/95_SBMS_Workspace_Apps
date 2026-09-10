package com.ashokit.services;

import com.ashokit.entity.Customer;
import com.ashokit.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer createBrandNewCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public Iterable<Customer> creatingNewBrandCustomers(List<Customer> customers) {
        return customerDao.saveAll(customers);
    }

    @Override
    public Customer findCustomerById(Integer customerId) {
        Optional<Customer> optionalCustomer = customerDao.findById(customerId);
        return optionalCustomer.orElse(null);
    }

    @Override
    public Iterable<Customer> fetchAllCustomers() {
        return customerDao.findAll();
    }
}
