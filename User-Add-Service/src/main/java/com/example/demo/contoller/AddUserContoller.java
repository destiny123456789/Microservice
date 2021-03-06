package com.example.demo.contoller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/consume")
public class AddUserContoller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	  @RequestMapping(value = "/useradd", method = RequestMethod.POST)
	   public String createProducts(@RequestBody User user) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<User> entity = new HttpEntity<User>(user,headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8081/save", HttpMethod.POST, entity, String.class).getBody();
	   }

	/*
	@PostMapping("/add")
	public String userAdd(){
		String url = "http://localhost:8081/save";
		//URI uri = new URI(url);
		//Object[] objects =  restTemplate.getForObject(url, Object[].class);
		
		//ResponseEntity<Object> entity = restTemplate.getForEntity(url, Object.class);
		//restTemplate.delete(url, Object.class);
		restTemplate.postForEntity(url, Object.class, null, null);

		//Object object = entity.getBody();
		//return Arrays.asList(entity);
		return "User has been deleted";

}*/
}
