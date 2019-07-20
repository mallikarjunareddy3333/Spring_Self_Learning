package com.arjun.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.arjun.spring.vo.Book;

@Repository
public class BookDAO {

	public String getWritterByBookId(int bookId) {
		if (bookId == 1) {
			return "Mohan";
		}
		return "Sohan";
	}

	List<Book> bookList = new ArrayList<>();
	{
		Book book1 = new Book(1, "Ramayana", 5, 4);
		Book book2 = new Book(2, "Mahabharat", 6, 3);
		bookList.add(book1);
		bookList.add(book2);
	}

	public Book getBook(int index) {
		return bookList.get(index);
	}

}
