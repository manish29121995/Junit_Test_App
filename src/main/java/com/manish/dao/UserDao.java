package com.manish.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public String findName(Integer id) {
		return "Aarav";
		
	}
}
