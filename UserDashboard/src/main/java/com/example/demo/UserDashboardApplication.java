package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
//@EnableEurekaServer
@SpringBootApplication
public class UserDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDashboardApplication.class, args);
	}
	
	    @Bean
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }

}
