package com.coforge.microservices.Customersservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	
	
	@GetMapping("/user")
	public String user() {
		return "Hello, user welcome";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello, admin welcome";
	}

}
