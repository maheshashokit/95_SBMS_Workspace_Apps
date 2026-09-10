package com.ashokit.dao;

import com.ashokit.entity.Customer;
import org.springframework.data.repository.CrudRepository;

//Automatically Consider as Spring bean we can autowire anywhere application
public interface CustomerDao extends CrudRepository<Customer,Integer> {


}