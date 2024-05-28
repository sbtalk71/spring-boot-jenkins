package com.demo.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping(path="/greet")
	public String getGreet() {
		return "Greetings from Spring REST";
	}
}
