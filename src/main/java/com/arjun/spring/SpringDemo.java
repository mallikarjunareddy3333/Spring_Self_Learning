package com.arjun.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring-config.xml");

		Book book = (Book) context.getBean("book");
		System.out.println("Book Name: " + book.getBookName());
		context.registerShutdownHook();
	}

}
