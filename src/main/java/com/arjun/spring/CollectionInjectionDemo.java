package com.arjun.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.bean.MyCollection;

public class CollectionInjectionDemo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyCollection myCollection = (MyCollection) context.getBean("myCollection");
		// access list
		System.out.println("---access list---");
		List<String> list = myCollection.getMyList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// access set
		System.out.println("---access set---");
		Set<String> set = myCollection.getMySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// access map
		System.out.println("---access map---");
		Map<Integer, String> map = myCollection.getMyMap();
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		// access properties
		System.out.println("---access properties---");
		Properties prop = myCollection.getMyProp();
		System.out.println(prop.getProperty("propKeyA"));
		System.out.println(prop.getProperty("propKeyB"));
		// Access Book List
		System.out.println("---Access Book List---");
		System.out.println(myCollection.getBookList().get(0).getBookName());
		System.out.println(myCollection.getBookList().get(1).getBookName());
		context.close();
	}

}
