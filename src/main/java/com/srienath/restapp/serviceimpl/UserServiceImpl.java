package com.srienath.restapp.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.srienath.restapp.model.User;
import com.srienath.restapp.ownrepo.UserRepo;
import com.srienath.restapp.service.UserService;
 
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
 
	public String addUser(User user) {
		if(repo != null) {
			repo.save(user);
			return "Success";
		}
		else {
			return "Fail to Add";
		}
	}
 
	public User getUserByEmail(String email) {
		return repo.findByEmail(email);
	}
 
	public List<User> getAllUsers() {
		return repo.findAll();
	}

}
