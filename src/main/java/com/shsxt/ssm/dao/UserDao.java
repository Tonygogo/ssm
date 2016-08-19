package com.shsxt.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shsxt.ssm.model.User;

@Repository
public interface UserDao {
	
	public List<User> find();
	
}
