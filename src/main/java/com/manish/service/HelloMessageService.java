package com.manish.service;

import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

	public String createHelloMsg() {
		String helloMsg = "Hello Everyone Welcome to Hyderabad...!! ";
		return helloMsg;
	}
	
	public String createGreetgMsg() {
		String greetMsg = "Good evening... all of you..";
		return greetMsg;
	}

}
