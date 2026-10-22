package com.ashokit.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wishes")
public class WishResources {
	
	@GetMapping("/")
	public ResponseEntity<String> getWishMessages(){
		String wishMessage = "Welcome To AshokIT For Rest API Development"+ LocalDate.now();
		return new ResponseEntity<String>(wishMessage, HttpStatus.OK);		
	}

}
