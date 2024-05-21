package com.manish.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloMessageServiceTest {

	@Autowired
	private HelloMessageService service;
	
	@Test
	public void testCreateHelloMsg() {
		String helloMsg = service.createHelloMsg();
		assertNotNull(helloMsg);
	}
	
	
	@Test
	public void testCreateGreetMsg() {
		String greetMsg = service.createGreetgMsg();
		assertNotNull(greetMsg);
	}
}
