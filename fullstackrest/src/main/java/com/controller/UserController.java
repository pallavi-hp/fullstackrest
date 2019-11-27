package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping (value="/readall")
	List<User> readAll()
	{
	 return userService.readUser();	
	 
	}
	@PostMapping (value="create")
public User createUser(@RequestBody User user){
		return this.userService.createUser(user);
	}
	@DeleteMapping(value="/delete/")
	
}

