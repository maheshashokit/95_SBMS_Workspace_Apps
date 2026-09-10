package com.ashokit.services;

import com.ashokit.entity.Customer;
import com.ashokit.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    //Injecting the DAO Object
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getCustomerInfo(int pageNo, int pageSize) {
        //Creating PageRequest For Pulling customer based on pageNo & pageSize
        Pageable pageableCustomer = PageRequest.of(pageNo, pageSize);

        //Passing the PageRequest object to findAll
        Page<Customer> pageCustomers = customerDao.findAll(pageableCustomer);

        //getting the Content of an Page......
        List<Customer> customersList =pageCustomers.getContent();

        return customersList;
    }

    @Override
    public void getCustomerInfo() {
        //Wanted to display all the pages of information
        int pageSize = 5;

        //Getting the customers count from Database Table
        long customerCount = customerDao.count();

        //Find the page count
        // 15/5 = 3, 15/4 = 4 (modify pagecount)
        long pageCount  = customerCount/pageSize; // 16/5 = 4

        //Modifying the pageCount
        pageCount  = (customerCount % pageSize == 0)? pageCount : ++pageCount;

        //displaying the Records page by page
        for(int pageNo = 0 ; pageNo < pageCount; pageNo++) {

            //Preparing the PageRequest Object
            PageRequest pageCustomers = PageRequest.of(pageNo, pageSize);
            //PageRequest pageCustomers = PageRequest.of(pageNo, pageSize,Sort.by("customerName"));
           // PageRequest pageCustomers = PageRequest.of(pageNo, pageSize, Sort.by(Sort.Direction.DESC, "customerName"));

            //Passing PageRequest object to findAll()
            Page<Customer> customersPage = customerDao.findAll(pageCustomers);

            //getting the content from Page
            System.out.println("Page No :: "+(pageNo+1)+ " Records........");
            customersPage.getContent().forEach(System.out::println);
        }
    }

    @Override
    public Iterable<Customer> saveAllCustomers(List<Customer> customers) {

        Iterable<Customer> savedCustomers = customerDao.saveAll(customers);

        return savedCustomers;
    }
}
