package com.arjun.spring.componentscan;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arjun.spring.config.AppConfig;
import com.arjun.spring.dao.BookDAO;
import com.arjun.spring.service.IUserService;
import com.arjun.spring.service.UserService;

public class SpringFilterAnnotationDemo {

	/*public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);

		ctx.refresh();

		try {
			CalcUtil calc = ctx.getBean(CalcUtil.class);
			System.out.println("Addition: " + calc.addNumbers(10, 20));

			BookDAO book = (BookDAO) ctx.getBean(BookDAO.class);
			System.out.println("Writter: " + book.getWritterByBookId(1));
		} catch (BeansException be) {
			System.out.println(be.getMessage());
		}

		try {
			UserService user = ctx.getBean(UserService.class);
			System.out.println("User Role:" + user.getUserRole());
		} catch (BeansException be) {
			System.out.println(be.getMessage());
		}

		try {
			IUserService userservice = ctx.getBean(IUserService.class);
			System.out.println(userservice.getUserRole() + " === Include filter type assignable");
		} catch (BeansException be) {
			System.out.println(be.getMessage());
		}

		ctx.close();
	}*/
}
