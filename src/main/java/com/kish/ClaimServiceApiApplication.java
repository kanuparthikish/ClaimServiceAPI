package com.kish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kish.claim.controller.ConfigProperties;

@SpringBootApplication
public class ClaimServiceApiApplication {

	
	public static void main(String[] args) {
		

		System.out.println("hello Kishore--------------&&&&&&&&&&&&");
		SpringApplication.run(ClaimServiceApiApplication.class, args);
	}

}
