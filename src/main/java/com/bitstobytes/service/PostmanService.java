package com.bitstobytes.service;

import java.util.List;

import com.bitstobytes.model.Users;

public interface PostmanService {

	public Users getAllUsersService();

	public Users getUser(List<Users> userList, int userId);

	public Users setUserValues(Users newuser);
}
