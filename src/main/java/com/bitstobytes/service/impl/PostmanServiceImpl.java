package com.bitstobytes.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bitstobytes.model.Users;
import com.bitstobytes.service.PostmanService;

@Service
public class PostmanServiceImpl implements PostmanService{

	@Override
	public Users getAllUsersService() {
		
		Users user=new Users();
		user.setUserId(1);
		user.setAddress("mumbai");
		user.setAge(20);
		user.setName("shreya");
		
		return user;
	}

	@Override
	public Users getUser(List<Users> userList, int userId) {
		Users user=null;
		for (Users users : userList) {
			if(users.getUserId()==userId) {
				System.out.println("found the user : ");
				user=users;
			}
		}
		System.out.println("user from service : "+user);
		return user;
	}

	@Override
	public Users setUserValues(Users newuser) {
		System.out.println("user in service :"+newuser.getName());
		Users user=new Users();
		
		user.setUserId(newuser.getUserId());
		user.setAddress(newuser.getAddress());
		user.setAge(newuser.getAge());
		user.setName(newuser.getName());
		
		System.out.println("user returned: "+user.getName());
		return user;
	}

	
}
