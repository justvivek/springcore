package com.springcore.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/constructor/injection/ciconfig.xml");
		Person p1 = context.getBean("person1", Person.class);
		System.out.println(p1);
		
		Person p2 = context.getBean("person2", Person.class);
		System.out.println(p2);
	}

}
