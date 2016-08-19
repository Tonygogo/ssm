package com.shsxt.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shsxt.ssm.model.User;
import com.shsxt.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/find")
	public String findUser(ModelMap model) {
		List<User> users = userService.find();
		model.put("users", users);
		return "user_list";
	}
	
}
