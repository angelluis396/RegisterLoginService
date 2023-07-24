package com.example.RegisterLoginService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class RegisterLoginServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterLoginServiceApplication.class, args);
	}

}
