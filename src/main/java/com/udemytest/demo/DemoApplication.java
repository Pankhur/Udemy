package com.udemytest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello Universe!");
	}
	
	//Add bean annotation for rest template, so spring will create an instance of rest template and inject into product controller 
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

}
