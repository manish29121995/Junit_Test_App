package com.manish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public String getUserName(Integer id) {
		String findName = dao.findName(id);
		System.out.println("Name :" + findName);
		return findName;
	}
}
