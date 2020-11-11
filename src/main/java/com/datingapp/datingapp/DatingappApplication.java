package com.datingapp.datingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.datingapp.datingapp.Services.UserService", "")
public class DatingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatingappApplication.class, args);
	}

}
