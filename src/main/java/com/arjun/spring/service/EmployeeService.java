package com.arjun.spring.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.arjun.spring.model.Employee;

@Named // @Component
public class EmployeeService {
	
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	
	@Inject // @Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
