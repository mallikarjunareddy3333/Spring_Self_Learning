package com.arjun.spring.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Address stAddress;
	
	public Address getStAddress() {
		return stAddress;
	}
	
}
