//package com.srienath.restapp.serviceimpl;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.srienath.restapp.model.User;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class UserServiceImplTest {
//
//	@Autowired
//	UserServiceImpl userServiceImpl;
//
//	@Test
//	void testAddUser() {
//		User obj= new User(3, "pawan", "pawan@gmail.com", "pawan@123");
//		assertEquals("Success",userServiceImpl.addUser(obj));			
//	}
//
//	@Test
//	void testAddUser2() {
//		User obj= null;
//		assertEquals("Fail to Add",userServiceImpl.addUser(obj));			
//	}
//	
//	@Test
//	void testGetUserByEmail() {
//		User user = new User();
//		user = userServiceImpl.getUserByEmail("pawan@gmail.com");
//		assertNotNull(user);
//	}
//	
//	@Test
//	void testGetUserByEmail2() {
//		User user = new User();
//		user = userServiceImpl.getUserByEmail("Black154@gmail.com");
//		assertNull(user);
//	}
//	
//	@Test
//	void testGetAllUsers() {
//		assertNotNull(userServiceImpl.getAllUsers());
//	}
//}
