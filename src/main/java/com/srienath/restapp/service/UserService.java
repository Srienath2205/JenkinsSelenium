package com.srienath.restapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
 
import com.srienath.restapp.model.User;
 
@Service
public interface UserService {
 
	public String addUser(User user);
	public User getUserByEmail(String email);
	public List<User> getAllUsers();

}
