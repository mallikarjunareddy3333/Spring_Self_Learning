package com.arjun.spring.config;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfig {
	
	@Before("execution(* com.arjun.aop.*.*(..))")
	public void logBefore(){
		System.out.println("@Before:"+new Date());
	}
	
	/*@After("execution(* com.arjun.aop.*.*(..))")
	public void logAfter(){
		System.out.println("@After:"+new Date());
	}
	
	@Around("execution(* com.arjun.aop.*.*(..))")
	public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("@Around: Before calculation-" + new Date());
		joinPoint.proceed();
		System.out.println("@Around: After calculation-" + new Date());
	}

	@AfterThrowing(pointcut = "execution(* com.arjun.aop.*.*(..))", throwing = "exception")
	public void logAfterThrowing(Exception exception) {
		System.out.println("@AfterReturning:" + new Date());
		System.out.println("Exception caught:" + exception.getMessage());
	}

	@AfterReturning(pointcut = "execution(* com.arjun.aop.*.*(..))", returning = "val")
	public void logAfterReturning(Object val) {
		System.out.println("Method return value:" + val);
		System.out.println("@AfterReturning:" + new Date());
	}*/

}
