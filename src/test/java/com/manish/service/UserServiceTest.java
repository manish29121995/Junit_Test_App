package com.manish.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.manish.dao.UserDao;

@SpringBootTest
@ExtendWith(value = {MockitoExtension.class})
public class UserServiceTest {

	
	@MockBean
	private UserDao dao;
	
	@InjectMocks
	private UserService service;
	
	@Test
	public void testGetUserName() {
	when(dao.findName(101)).thenReturn("Mannu");
		String userName = service.getUserName(101);
		assertEquals("Mannu", userName);
		
	}
}
