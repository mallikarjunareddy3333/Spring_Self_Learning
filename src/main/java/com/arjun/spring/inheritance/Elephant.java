package com.arjun.spring.inheritance;

import org.springframework.stereotype.Component;

@Component
public class Elephant extends Animal {
	private String location;
	
	public Elephant() {
		System.out.println("Inside elephant");
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
