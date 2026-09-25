package com.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.entity.Customer;
import com.ashokit.services.CustomerService;
import com.ashokit.dao.CustomerDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

//mahesh.ashokit@gmail.com
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerDao customerDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer  = new Customer();
        customer.setCustomerName("Suresh2");
        customer.setCustomerLocation("Hyderabad");

        //calling the saveCustomer
        //Customer savedCustomer = customerService.createNewBrandCustomerUsingSaveAndFlush(customer);
        //System.out.println(savedCustomer);
        //calling the delete customers
      // customerService.terminateCustomers(List.of(122,133,156));

        //fetching all Customers
        //Customer cust = new Customer();
        //cust.setCustomerName("Mahesh");
        //cust.setCustomerLocation("Hyderabad1");

        //Will fetch all the records from table
        //customerService.fetchAllCustomers(cust);

        //getting the customerDetails
       //Customer customerInfo = customerService.fetchCustomerDetailsById(123);
       // System.out.println(customerInfo);

        //Fetching the customers
        System.out.println("1...... Finding the Customers Based on Name");
        List<Customer> customerByName = customerDao.findByCustomerName("Mahesh");
        customerByName.forEach(System.out::println);

        System.out.println("2...... Finding the Customers Based on Location");
        Customer customerByName1 = customerDao.findByCustomerNameAndCustomerLocation("Mahesh", "Hyderabad1");
        System.out.println("customerByName1 = " + customerByName1);

        System.out.println("3...... Finding the Customers Based on Location");
        Page<Customer> customerByName2 = customerDao.findByCustomerLocation("Hyderabad1", PageRequest.of(0,3));
        customerByName2.getContent().forEach(System.out::println);

        System.out.println("4...... Finding the Customers Count Based On CustomerName");
        Integer customerByName3= customerDao.countByCustomerLocation("Hyderabad1");
        System.out.println("customerByName3 = " + customerByName3);

        System.out.println("*************** Custom Queries Using @Query Annotation***************");
        List<Customer> customers = customerDao.getAllCustomers();
        customers.forEach(System.out::println);
        List<Customer> customers1 = customerDao.getAllCustomersByNativeQuery();
        customers1.forEach(System.out::println);
        List<Object[]> allCustomers = customerDao.getSelectedColumns();
        for(Object[] customerDetails: allCustomers){
            System.out.println(customerDetails[0] +"==========="+customerDetails[1]);
        }

        List<Customer> allCust = customerDao.getCustomerByLocationUsingIndex("Hyderabad1");
        allCust.forEach(System.out::println);
    }
}