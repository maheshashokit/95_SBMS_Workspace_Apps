package com.ashokit.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="ashokit_enquires")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer enquiryId;
	
	@Column(name="enquiry_name")
	private String name;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="contact_no")
	private String contactNo;
	
	@Column(name="course")
	private String course;
	
	@Column(name="created_dt")
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	public Enquiry() {
		
	}
	
	public Enquiry(String name, String emailId, String contactNo, String course) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.course = course;
	}

	public Integer getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", name=" + name + ", emailId=" + emailId + ", contactNo="
				+ contactNo + ", course=" + course + ", createdDate=" + createdDate + "]";
	}	
}
