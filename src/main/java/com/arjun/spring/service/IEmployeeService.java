package com.arjun.spring.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.arjun.spring.bean.IEmployee;

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
