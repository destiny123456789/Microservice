package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.sun.org.apache.xerces.internal.util.URI;

@RestController
@RequestMapping("/consume")
public class ResttemplateDemo {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/allusers")
	public List<Object> getAllUsers(){
		String url = "http://localhost:8081/all";
		Object[] objects =  restTemplate.getForObject(url, Object[].class);
		
		return Arrays.asList(objects);
		
	}
	
	
	
	
		
}
	
	


