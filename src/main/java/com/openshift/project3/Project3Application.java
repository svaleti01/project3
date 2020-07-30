package com.openshift.project3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project3Application {

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}
	
	@RequestMapping(value = "/getgreeting")
	public ResponseEntity<String> getGreeting() {
		return new ResponseEntity<String>("Hello again", HttpStatus.OK);
	}

}
