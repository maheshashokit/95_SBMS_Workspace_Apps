package com.ashokit.dao;

import com.ashokit.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Automatically Consider as Spring bean we can autowire anywhere application
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    List<Customer> findByCustomerName(String customerName);

    List<Customer> findByCustomerLocation(String customerLocation);

    Customer findByCustomerNameAndCustomerLocation(String customerName,String customerLocation);

    Page<Customer> findByCustomerLocation(String location, Pageable pageable);

    List<Customer> findByCustomerName(String name, Sort sort);

    Integer countByCustomerLocation(String customerLocation);

    @Query(value="from Customer C")
    List<Customer> getAllCustomers();

    @Query(value="select ac.* from ashokit_customers ac", nativeQuery = true)
    List<Customer> getAllCustomersByNativeQuery();

    @Query(value="select c.customerId,c.customerName from Customer c")
    List<Object[]> getSelectedColumns();

    @Query(value="select c.customer_id,c.customer_name from ashokit_customers c", nativeQuery = true)
    List<Object[]> getSelectedColumnsByNativeQuery();

    @Query(value="from Customer c where c.customerLocation=:custLocation")
    List<Customer> getCustomerByLocation(String custLocation);

    @Query(value="select * from ashokit_customers where customer_location=?1", nativeQuery = true)
    List<Customer> getCustomerByLocationUsingIndex(String custLocation);

}