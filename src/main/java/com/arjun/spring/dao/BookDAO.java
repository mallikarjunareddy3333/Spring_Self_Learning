package com.arjun.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	public String getWritterByBookId(int bookId) {
		if (bookId == 1) {
			return "Mohan";
		}
		return "Sohan";
	}

}
