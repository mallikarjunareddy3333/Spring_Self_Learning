package com.arjun.spring.bean;

import javax.inject.Inject;
import javax.inject.Provider;

import org.springframework.stereotype.Component;

@Component
public class EmployeeProviderBean {

	@Inject
	private Provider<Employee> employeeProvider;

	public Employee getEmployee() {
		return employeeProvider.get();
	}

}
