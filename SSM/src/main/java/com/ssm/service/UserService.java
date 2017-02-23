package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}
	
	
}
