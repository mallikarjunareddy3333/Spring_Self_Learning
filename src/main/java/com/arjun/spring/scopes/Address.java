package com.arjun.spring.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope("singleton")
@Scope(value="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Address {

	private String city = "Varanasi";

	public Address() {
		System.out.println("My City: " + city);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
