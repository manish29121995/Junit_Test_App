package com.manish.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manish.dto.Product;

@WebMvcTest(controllers = ProductRestController.class)
public class ProductRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testAddProduct() throws Exception {
		
		Product p = new Product();
		p.setId(10081);
		p.setName("iphone 15pro");
		
		ObjectMapper mapper = new ObjectMapper();
		String productJson = mapper.writeValueAsString(p);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/product")
		.contentType("application/json")
		.content(productJson);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		assertEquals(201, status);
		
		
		
	}
	
}
