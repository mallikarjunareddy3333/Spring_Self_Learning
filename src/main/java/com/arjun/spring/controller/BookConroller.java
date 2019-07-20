package com.arjun.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arjun.spring.dao.BookDAO;
import com.arjun.spring.service.BookService;
import com.arjun.spring.vo.Book;

@Controller
public class BookConroller {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookDAO bookdao;
	
	@GetMapping(value = "/book/service")
	public ModelAndView bookName(ModelAndView modelAndView) {
		modelAndView.addObject("bookName", bookService.largestAreaBookName());
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
	@GetMapping
	public Book getAllBooks() {
		return bookdao.getBook(1);
	}
}
