package com.shsxt.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsxt.ssm.dao.UserDao;
import com.shsxt.ssm.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> find() {
		return userDao.find();
	}
	
	
}
