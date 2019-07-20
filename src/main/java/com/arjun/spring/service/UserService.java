package com.arjun.spring.service;

public class UserService implements IUserService {
	
	@Override
	public String getUserRole() {
		return "admin";
	}

}
