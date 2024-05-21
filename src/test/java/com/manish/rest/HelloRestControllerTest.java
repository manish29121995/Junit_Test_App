package com.manish.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.manish.service.HelloMessageService;

@WebMvcTest(controllers = HelloRestController.class)
public class HelloRestControllerTest {
	
	@MockBean
	private HelloMessageService msgService;

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetHelloMsg() throws Exception {
		when(msgService.createHelloMsg()).thenReturn("Hello mannu...");
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String contentAsString = response.getContentAsString();
		System.out.println(contentAsString);
		
		int status = response.getStatus();
		assertEquals(200, status);
	}
	
	@Test
	public void testGetGreetMsg() throws Exception {
		when(msgService.createGreetgMsg()).thenReturn("Good Evening Yani....");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String contentAsString = response.getContentAsString();
		System.out.println(contentAsString);
		
		int status = response.getStatus();
		assertEquals(200, status);
		
	}
	
	
	
}
