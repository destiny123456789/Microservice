package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consume")
public class USerSearchPincodeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/pin/{pin}")
	public Object getserviaPincode(@PathVariable(value = "pin") String pin ){
		String url = "http://localhost:8081/pincode/" + pin;
		//URI uri = new URI(url);
		//Object[] objects =  restTemplate.getForObject(url, Object[].class);
		
		ResponseEntity<Object> entity = restTemplate.getForEntity(url, Object.class);
		
		Object object = entity.getBody();
		//return Arrays.asList(entity);
		return object;
		
}

}
