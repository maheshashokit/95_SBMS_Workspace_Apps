package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.services.EmployeeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//Request Processing Method
	@RequestMapping(value="welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("welcomeMessage", "Welcome To AshokIT for SpringBoot MVC Development");
		return mav;		
	}
	
	//Request Processor method
	@RequestMapping(value="wishes")
	public ModelAndView getWishes() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("wishes");
		mav.addObject("wishMessage", "Good Morning AshokIT");
		return mav;
	}
	
	
	//Request Processor method to display employees data
	@RequestMapping(value="employees",method=RequestMethod.GET)
	public ModelAndView getEmployees() {
		return new ModelAndView("wishes","employees",employeeService.getEmployees());
	}
}
