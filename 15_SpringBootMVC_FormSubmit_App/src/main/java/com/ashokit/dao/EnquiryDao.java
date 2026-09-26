package com.ashokit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import com.ashokit.entity.Enquiry;

public interface EnquiryDao extends ListCrudRepository<Enquiry, Integer> {

}
