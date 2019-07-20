package com.arjun.spring.utitlity;

import org.springframework.stereotype.Component;

@Component
public class BookUtility {
	public int calculateArea(int length, int width) {
		return length * width;
	}
}
