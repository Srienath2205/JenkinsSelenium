package com.srienath.restapp.controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.srienath.restapp.model.User;
import com.srienath.restapp.serviceimpl.UserServiceImpl;
 
@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000")
public class UserController {
 
	
	UserServiceImpl service;
	public UserController(UserServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertUser(@RequestBody User user) {
		String msg = "";
		try {
			System.out.println(user);
			service.addUser(user);
			msg = "Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure";
		}
		return msg;
	}
 
	@GetMapping("/getEmail/{email}")
	public User viewUserByEmail(@PathVariable("email") String email) {
		System.out.print(email);
		return service.getUserByEmail(email);
	}
 
	@GetMapping("/all")
	public List<User> getUsers() {
		return service.getAllUsers();
	}
}