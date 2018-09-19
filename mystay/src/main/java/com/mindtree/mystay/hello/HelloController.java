package com.mindtree.mystay.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //- request/response URLs
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
}
