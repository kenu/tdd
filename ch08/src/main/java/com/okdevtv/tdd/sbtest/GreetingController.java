package com.okdevtv.tdd.sbtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
	private GreetingService service;
	
	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@GetMapping("/greeting")
	public @ResponseBody String greetingOther() {
		return service.greet();
	}

	@GetMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
}
