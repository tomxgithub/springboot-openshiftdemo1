package com.example.springbootopenshiftdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenshiftResource {

	@GetMapping("/test")
	public String test() {
		return "Welcome to Spring Boot from Openshift";
	}
}
