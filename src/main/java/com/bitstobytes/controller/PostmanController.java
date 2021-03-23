package com.bitstobytes.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitstobytes.model.Users;
import com.bitstobytes.service.PostmanService;

@RestController
@RequestMapping("/postman")
public class PostmanController {
	private static final Logger log= LoggerFactory.getLogger(PostmanController.class);
	@Autowired
	PostmanService service;
	
	private List<Users> usersList= new ArrayList<Users>();
	
	@GetMapping("/getUsers")
	public List<Users> getallUsers() {
		Users user= new Users();

		return usersList;
	}
	
	@PostMapping("/addUser")
	public List<Users> addUser(@RequestBody Users newuser){
		System.out.println("user received in controller : "+newuser.getName());
		Users user=new Users();
		
		user= service.setUserValues(newuser);
		
		usersList.add(user);
		
		return usersList;
	}
	
	@PutMapping("/updateUser/{userId}")
	public Users updateUser(@PathVariable int userId, @RequestBody Users user) {
		Users updUser= service.getUser(usersList, userId);

		if(updUser != null) {
			updUser= service.setUserValues(user);
			System.out.println("user updated to : "+updUser.getName());
		}
		
		return updUser;
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public List<Users> deleteUser(@PathVariable int userId) {
		Users updUser= service.getUser(usersList, userId);

		if(updUser != null) {
			usersList.remove(updUser);
		}
		
		return usersList;
	}

}
