package com.arjun.spring;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.bean.Book;
import com.arjun.spring.bean.Employee;
import com.arjun.spring.bean.EmployeeProviderBean;
import com.arjun.spring.bean.SalesEmployee;
import com.arjun.spring.config.AppConfig;
import com.arjun.spring.dao.VillageDAO;
import com.arjun.spring.inheritance.Elephant;
import com.arjun.spring.service.BookService;
import com.arjun.spring.service.EmployeeService;
import com.arjun.spring.service.IEmployeeService;
import com.arjun.spring.service.MyEmployeeService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringDemo extends SpringBootServletInitializer {

	// private static AbstractApplicationContext context;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringDemo.class);
	}

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = SpringApplication.run(SpringDemo.class, args);

		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("app-conf.xml");
		VillageDAO vill = (VillageDAO) context.getBean("villageDAO");
		vill.save();
		vill.selectFirstRow();

		Elephant elephant = context.getBean(Elephant.class);
		elephant.setAge(20);
		elephant.setLocation("varanasi");
		elephant.setName("Boss");
		
		System.out.println(elephant.getName());
		System.out.println(elephant.getLocation());
		System.out.println(elephant.getAge());
		
		BookService bookService = context.getBean(BookService.class);
		System.out.println("Largest Area Book Name: " + bookService.largestAreaBookName());

	}

	/*
	 * AbstractApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring-config.xml"); Book book =
	 * (Book)context.getBean("book"); System.out.println("Book Name:"+
	 * book.getBookName()); context.registerShutdownHook();
	 * 
	 * 
	 * AnnotationConfigApplicationContext context = new
	 * AnnotationConfigApplicationContext(); context.register(AppConfig.class);
	 * 
	 * context.refresh();
	 * 
	 * Book book1 = (Book) context.getBean("myBook");
	 * System.out.println("Book Name:" + book1.getBookName());
	 * 
	 * EmployeeService service = context.getBean(EmployeeService.class);
	 * System.out.println(service.getEmployee().getEmpMessage() +
	 * " === setter injection");
	 * 
	 * SalesEmployee emp = (SalesEmployee) context.getBean("sales");
	 * System.out.println(emp.getEmployee().getEmpMessage() +
	 * " === constructor injection");
	 * 
	 * MyEmployeeService obj = context.getBean(MyEmployeeService.class);
	 * System.out.println(obj.getEmployee().getEmpMessage() +
	 * " === field injection");
	 * 
	 * EmployeeProviderBean emp2 = context.getBean(EmployeeProviderBean.class);
	 * System.out.println(emp2.getEmployee().getEmpMessage() +
	 * " === using Provider");
	 * 
	 * IEmployeeService emp3 = context.getBean(IEmployeeService.class);
	 * System.out.println(emp3.getEmployee().getEmpMsg() + " === qualified ");
	 * 
	 * context.close();
	 * 
	 * }
	 */
}
