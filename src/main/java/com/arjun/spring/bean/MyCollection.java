package com.arjun.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCollection {
	private List<String> myList;
	private Set<String> mySet;
	private Map<Integer, String> myMap;
	private Properties myProp;
	private List<Book> bookList;

	public MyCollection() {
	}

	public MyCollection(List<String> myList, Set<String> mySet, Map<Integer, String> myMap, Properties myProp,
			List<Book> bookList) {
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.myProp = myProp;
		this.bookList = bookList;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public Set<String> getMySet() {
		return mySet;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public Map<Integer, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProp() {
		return myProp;
	}

	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}
