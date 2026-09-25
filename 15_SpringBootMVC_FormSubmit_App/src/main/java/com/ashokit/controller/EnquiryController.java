package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.service.EnquiryService;
import com.ashokit.entity.*;

@Controller
public class EnquiryController {
	
	@Autowired
	private EnquiryService enquiryService;
	
	@RequestMapping(value="enquiryForm")
	public String getEnquiryPage() {
		return "enquiryForm";
	}
	
	@RequestMapping(value="enquiry",method=RequestMethod.POST)
	public ModelAndView processEnquiry(@RequestParam("enquiryName") String name,
									   @RequestParam("emailId") String emailId,
									   @RequestParam("contactNo") String contactNo,
									  @RequestParam("course") String course
			                          ) {
		
		Enquiry enquiry = new Enquiry(name,emailId,contactNo,course);
		
		Enquiry savedEnquiryDetails = enquiryService.saveEnquiryDetails(enquiry);
		
		ModelAndView mav = new ModelAndView("enquiryForm");
		
		if(savedEnquiryDetails != null) {
			mav.addObject("message", "Enquiry Submitted Successfully....");
		}else {
			mav.addObject("message", "Enquiry Failed to submit....");
		}
		return mav;
	}

}
