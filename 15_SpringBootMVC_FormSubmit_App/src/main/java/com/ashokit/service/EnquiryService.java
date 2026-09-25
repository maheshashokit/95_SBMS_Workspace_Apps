package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.EnquiryDao;
import com.ashokit.entity.Enquiry;

@Service
public class EnquiryService {

	@Autowired
	private EnquiryDao enquiryDao;
	
	public Enquiry saveEnquiryDetails(Enquiry enquiryInfo) {
		enquiryInfo.setCreatedDate(new java.sql.Date(new java.util.Date().getTime()));
		Enquiry savedEnquiryDetails = enquiryDao.save(enquiryInfo);
		return savedEnquiryDetails;		
	}	
}