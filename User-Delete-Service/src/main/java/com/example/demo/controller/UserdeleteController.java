package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consume")
public class UserdeleteController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@DeleteMapping("/userdelete/{username}")
	public String userDelete(@PathVariable(value = "username") String username ){
		String url = "http://localhost:8081/udelete/" + username;
		//URI uri = new URI(url);
		//Object[] objects =  restTemplate.getForObject(url, Object[].class);
		
		//ResponseEntity<Object> entity = restTemplate.getForEntity(url, Object.class);
		restTemplate.delete(url, Object.class);

		//Object object = entity.getBody();
		//return Arrays.asList(entity);
		return "User has been deleted";

}
}
