package com.myapp.spring.web;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestApi {
	
	@GetMapping
	public String sayHello() {
		
		return "Welcome to world of Rest Api with java spring and current date "
		+LocalDate.now();
	}

     public String sayHello1() {
		
		return "Welcome to world of Rest Api with java1 spring and current date "
		+LocalDate.now();
	}

}
