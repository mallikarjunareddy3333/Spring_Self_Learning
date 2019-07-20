package com.arjun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.arjun.spring.bean.Book;
import com.arjun.spring.componentscan.MyAnnotation;
import com.arjun.spring.service.IUserService;

@Configuration
@ComponentScan(basePackages = "com.arjun.spring", includeFilters = { @Filter(MyAnnotation.class),
		/* @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IUserService.class) */ }, excludeFilters = @Filter(Repository.class))
public class AppConfig {

	@Bean(name = "myBook")
	public Book getBean() {
		Book book = new Book();
		book.setBookName("MahaBharat");
		return book;
	}

}
