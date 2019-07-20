package com.arjun.spring.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.arjun.spring.bean.Employee;

@Named
public class MyEmployeeService {

	@Inject
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

}
