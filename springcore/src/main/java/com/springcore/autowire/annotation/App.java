package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/config.xml");
		Emp e1 = context.getBean("emp1", Emp.class);
		
		System.out.println(e1);
		
	}
}
