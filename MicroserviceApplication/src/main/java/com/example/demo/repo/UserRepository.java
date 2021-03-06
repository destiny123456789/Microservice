package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.User;

//import org.springframework.data.mongodb.MongoDbFactory;
import java.util.*;


public interface UserRepository extends MongoRepository<User, String> {
	
	List<User> findByPincode(String pincode);
	
	   User findByUsername(String username);
	   
	 //  User findByEmail(String email);

}
