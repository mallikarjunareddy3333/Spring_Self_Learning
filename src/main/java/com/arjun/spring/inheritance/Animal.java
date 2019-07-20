package com.arjun.spring.inheritance;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		System.out.println("Inside animal");
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
}
