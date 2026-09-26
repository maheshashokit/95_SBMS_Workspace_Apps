package com.ashokit.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.EnquiryDao;
import com.ashokit.dto.EnquiryDto;
import com.ashokit.entity.Enquiry;

@Service
public class EnquiryService {

	@Autowired
	private EnquiryDao enquiryDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public EnquiryDto saveEnquiryDetails(EnquiryDto enquiryDto) {
		
		//conversion from DTO to Entity class
		Enquiry enquiryInfo = modelMapper.map(enquiryDto, Enquiry.class);
		
		enquiryInfo.setCreatedDate(new java.sql.Date(new java.util.Date().getTime()));
		Enquiry savedEnquiryDetails = enquiryDao.save(enquiryInfo);
		
		//conversion from Entity to DTO class
		return modelMapper.map(savedEnquiryDetails, EnquiryDto.class);		
	}
	
	public List<Enquiry> getAllEnquires(){		
		return enquiryDao.findAll();
	}
}