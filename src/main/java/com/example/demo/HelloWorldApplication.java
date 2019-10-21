package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@RestController
public class HelloWorldApplication extends SpringBootServletInitializer {

	
	
	
		@GetMapping("/message")
	public String getMessage() {
		return "Welcome JKH";
	}
	
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
