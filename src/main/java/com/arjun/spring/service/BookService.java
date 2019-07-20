package com.arjun.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arjun.spring.dao.BookDAO;
import com.arjun.spring.utitlity.BookUtility;
import com.arjun.spring.vo.Book;

@Service
public class BookService {

	@Autowired
	private BookDAO bookDAO;

	@Autowired
	private BookUtility utility;

	public String largestAreaBookName() {
		int larea = 0;
		String bookName = "";
		for (int i = 0; i < 2; i++) {
			Book book = bookDAO.getBook(i);
			int area = utility.calculateArea(book.getLength(), book.getWidth());
			if (larea < area) {
				larea = area;
				bookName = book.getBookName();
			}
		}
		return bookName;
	}
}
