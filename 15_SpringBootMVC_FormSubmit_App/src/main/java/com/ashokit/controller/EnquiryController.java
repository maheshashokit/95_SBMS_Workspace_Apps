package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.service.EnquiryService;
import com.ashokit.dto.EnquiryDto;
import com.ashokit.entity.*;

@Controller
public class EnquiryController {
	
	@Autowired
	private EnquiryService enquiryService;
	
	@RequestMapping(value="enquiryForm")
	public String getEnquiryPage() {
		return "enquiryForm";
	}
	
	@RequestMapping(value="studentEnquiry")
	public String getStudentEnquiryPage(ModelMap modelMap) {
		modelMap.addAttribute("enquiryObject", new Enquiry());
		return "studentenquiry";
	}
	
	@RequestMapping(value="enquiry",method=RequestMethod.POST)
	public ModelAndView processEnquiry(@RequestParam("enquiryName") String name,
									   @RequestParam("emailId") String emailId,
									   @RequestParam("contactNo") String contactNo,
									   @RequestParam("course") String course
			                          ) {
		
		EnquiryDto enquiry = new EnquiryDto(name,emailId,contactNo,course);
		
		EnquiryDto savedEnquiryDetails = enquiryService.saveEnquiryDetails(enquiry);
		
		ModelAndView mav = new ModelAndView("enquiryForm");
		
		if(savedEnquiryDetails != null) {
			mav.addObject("message", "Enquiry Submitted Successfully....");
		}else {
			mav.addObject("message", "Enquiry Failed to submit....");
		}
		return mav;
	}
	
	@RequestMapping(value="studentenquiry",method=RequestMethod.POST)
	public ModelAndView processStudentEnquiry(@ModelAttribute("enquiryObject") EnquiryDto enquiry){
		
		EnquiryDto savedEnquiryDetails = enquiryService.saveEnquiryDetails(enquiry);
		
		ModelAndView mav = new ModelAndView("studentenquiry");
		
		if(savedEnquiryDetails != null) {
			mav.addObject("message", "Enquiry Submitted Successfully....");
			mav.addObject("enquiryList", enquiryService.getAllEnquires());
		}else {
			mav.addObject("message", "Enquiry Failed to submit....");
		}
		return mav;
	}

}
