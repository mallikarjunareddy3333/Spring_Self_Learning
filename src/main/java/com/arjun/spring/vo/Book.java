package com.arjun.spring.vo;

public class Book {
	private int bookId;
	private String bookName;
	private int length;
	private int width;

	public Book(int bookId, String bookName, int length, int width) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.length = length;
		this.width = width;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
}
