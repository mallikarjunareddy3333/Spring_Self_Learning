package com.arjun.spring;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Book book = (Book)context.getBean("book");
		System.out.println("Book Name:"+ book.getBookName());
	    context.registerShutdownHook();
//		
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(AppConfig.class);
//		
//		context.refresh();
//		
//		Book book1 = context.getBean(Book.class);
//		System.out.println("Book Name:" + book1.getBookName() );
//		context.close();
//		
	}

}
