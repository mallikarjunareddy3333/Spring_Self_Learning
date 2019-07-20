package com.arjun.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.bean.Book;
import com.arjun.spring.bean.Employee;
import com.arjun.spring.bean.EmployeeProviderBean;
import com.arjun.spring.bean.SalesEmployee;
import com.arjun.spring.config.AppConfig;
import com.arjun.spring.service.EmployeeService;
import com.arjun.spring.service.IEmployeeService;
import com.arjun.spring.service.MyEmployeeService;

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
		System.out.println(service.getEmployee().getEmpMessage() + " === setter injection");

		SalesEmployee emp = (SalesEmployee) context.getBean("sales");
		System.out.println(emp.getEmployee().getEmpMessage() + " === constructor injection");

		MyEmployeeService obj = context.getBean(MyEmployeeService.class);
		System.out.println(obj.getEmployee().getEmpMessage() + " === field injection");

		EmployeeProviderBean emp2 = context.getBean(EmployeeProviderBean.class);
		System.out.println(emp2.getEmployee().getEmpMessage() + " === using Provider");

		IEmployeeService emp3 = context.getBean(IEmployeeService.class);
		System.out.println(emp3.getEmployee().getEmpMsg() + " === qualified ");

		context.close();

	}

}
