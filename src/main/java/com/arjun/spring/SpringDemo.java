package com.arjun.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.config.AppConfig;
import com.arjun.spring.model.Book;
import com.arjun.spring.service.EmployeeService;

public class SpringDemo {

	// private static AbstractApplicationContext context;

	public static void main(String[] args) {

		/*
		 * AbstractApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring-config.xml"); Book book =
		 * (Book)context.getBean("book"); System.out.println("Book Name:"+
		 * book.getBookName()); context.registerShutdownHook();
		 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);

		context.refresh();
		
		Book book1 = (Book) context.getBean("myBook");
		System.out.println("Book Name:" + book1.getBookName());

		EmployeeService service = context.getBean(EmployeeService.class);
		System.out.println(service.getEmployee().getEmpMessage());
		
		context.close();

	}

}
