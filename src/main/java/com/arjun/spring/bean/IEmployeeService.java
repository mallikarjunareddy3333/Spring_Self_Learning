package com.arjun.spring.bean;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class IEmployeeService {
	
	private IEmployee employee;
	
	@Inject
	private IEmployeeService( @Named("soft") IEmployee employee) {
		this.employee = employee;
	}
	
	public IEmployee getEmployee() {
		return employee;
	}
	
 }
