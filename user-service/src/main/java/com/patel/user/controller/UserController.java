package com.patel.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patel.user.entity.User;
import com.patel.user.service.UserService;
import com.patel.user.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public User saveUser(@RequestBody User user)
	{
		log.info("inside saveUser() of UserController");
		return userService.saveUser(user);
	}
	@GetMapping("/{id}")
	public ResponseTemplateVo getUserWithDepartment(@PathVariable("id") Long userId)
	{
		log.info("inside getUserWithDepartment() of User Controller");
		return userService.getUserWithDepartment(userId);
	}
}
