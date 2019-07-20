package com.arjun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.arjun.spring.bean.Book;

@Configuration
@ComponentScan(basePackages="com.arjun.spring")
public class AppConfig {

	@Bean(name = "myBook")
	public Book getBean() {
		Book book = new Book();
		book.setBookName("MahaBharat");
		return book;
	}

}
