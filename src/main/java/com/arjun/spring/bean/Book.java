package com.arjun.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, BeanClassLoaderAware {

	private int bookId;
	private String bookName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Book() {
		System.out.println("----inside constructor------");
	}

	public Book(int i, String string, int j, int k) {
		
	}
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("----BeanClassLoaderAware.setBeanClassLoader------");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("-------BeanNameAware.setBeanName------");
	}

	public void myPostConstruct() {
		System.out.println("---init-method---");
	}

	@PostConstruct
	public void springPostConstruct() {
		System.out.println("---@PostConstruct---");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("---BeanFactoryAware.setBeanFactory---");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---InitializingBean.afterPropertiesSet---");
	}

	public void myPreDestroy() {
		System.out.println("-----destroy method------");
	}

	@PreDestroy
	public void springPreDestroy() {
		System.out.println("--------@PreDestroy------");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("---DisposableBean.destroy---");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("---inside finalize---");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
		System.out.println("setBookName: Book name has set.");
	}

}
