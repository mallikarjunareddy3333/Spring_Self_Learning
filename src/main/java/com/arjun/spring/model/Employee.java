package com.arjun.spring.model;

import javax.inject.Named;

@Named
public class Employee {
	public String getEmpMessage() {
		return "Software makes world beautiful";
	}
}
