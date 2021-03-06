/*package com.example.demo;

//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
//import com.netflix.discovery.converters.Auto;


@DataMongoTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RepoTest {
	
	@Autowired
	private TestEntityManager testentitiEntityManager;
	
	@Autowired
	private UserRepository userrepo;
	
	@Test
	public void fetchUser() {
		User user = new User();
		user.setName("Pritam");
		user.setUsername("Pritam");
		user.setPassword("Pritam123");
		user.setAddress("UP");
		user.setCity("Noida");
		user.setEmail("Pritam@gmail.com");
		user.setPincode("546344");
		
		testentitiEntityManager.persist(user);
		
		
		User user1 =userrepo.findByUsername(user.getUsername());
		
		assertEquals(user1.getPincode(), user.getPincode());
		
		
		
	}
	
	
	
	
	
	

}
*/