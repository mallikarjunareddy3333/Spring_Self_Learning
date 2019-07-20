package com.arjun.spring.bean;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class MyEmployeeService {

	@Inject
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

}
