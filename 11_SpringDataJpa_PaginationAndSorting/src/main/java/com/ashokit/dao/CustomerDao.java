package com.ashokit.dao;

import com.ashokit.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//Automatically Consider as Spring bean we can autowire anywhere application
public interface CustomerDao extends PagingAndSortingRepository<Customer, Integer>,CrudRepository<Customer, Integer>{

}