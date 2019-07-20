package com.arjun.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "myBook")
	public Book getBean() {
		Book book = new Book();
		book.setBeanName("MahaBharath");
		return book;
	}

}
