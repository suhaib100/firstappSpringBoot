package com.springboot.demo.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstappApplication.class, args);
	}



}
