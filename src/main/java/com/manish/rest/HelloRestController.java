package com.manish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.service.HelloMessageService;

@RestController
public class HelloRestController {

	@Autowired
	private HelloMessageService service;
	
	@GetMapping("/hello")
	public String getHelloMsg() {
		System.out.println(service.getClass().getName());
		String helloMsg = service.createHelloMsg();
		helloMsg = helloMsg.toUpperCase();
		return helloMsg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		System.out.println(service.getClass().getName());
		String greetgMsg = service.createGreetgMsg();
		greetgMsg = greetgMsg.toUpperCase();
		return greetgMsg;
	}
}
