package com.ashokit.dto;

import java.util.Date;

public class EnquiryDto {
	
	private Integer enquiryId;
	
	private String name;
	
	private String emailId;
	
	private String contactNo;
	
	private String course;
	
	private Date createdDate;

	public EnquiryDto() {
		
	}	

	public EnquiryDto (String name, String emailId, String contactNo, String course) {
		this.enquiryId = enquiryId;
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.course = course;
		this.createdDate = createdDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	

}
