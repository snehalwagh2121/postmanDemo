package com.bitstobytes.model;

import lombok.Data;

@Data
public class Users {

	private int userId;
	private String name;
	private int age;
	private String address;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
//	public Users() {
//		super();
//	}
//
//
//	public Users(int userId, String name, int age, String address) {
//		super();
//		this.userId = userId;
//		this.name = name;
//		this.age = age;
//		this.address = address;
//	}
//	
//	
}
