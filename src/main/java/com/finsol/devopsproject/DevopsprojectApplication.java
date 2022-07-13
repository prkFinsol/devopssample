package com.finsol.devopsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsprojectApplication.class, args);
	}
	
	@GetMapping("/messageonetwo")
	public String getMessage(){
		return "Welcome To DevOps";
	}

}
