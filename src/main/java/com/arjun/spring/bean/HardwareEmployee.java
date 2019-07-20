package com.arjun.spring.bean;

import javax.inject.Named;

@Named("hard")
public class HardwareEmployee implements IEmployee {

	@Override
	public String getEmpMsg() {
		return "Hardware Employee";
	}

}
