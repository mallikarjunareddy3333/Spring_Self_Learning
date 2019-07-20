package com.arjun.spring.bean;

import javax.inject.Inject;
import javax.inject.Named;

@Named("sales")
public class SalesEmployee {

	private Employee employee;

	@Inject
	public SalesEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

}
