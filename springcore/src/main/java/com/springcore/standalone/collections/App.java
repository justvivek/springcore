package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
		Person p1 = context.getBean("friends", Person.class);
//		System.out.println(p1);
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("-------------------------------------------------------------");
		System.out.println(p1.getCourses());
		System.out.println(p1.getCourses().getClass().getName());
		System.out.println("-------------------------------------------------------------");
		System.out.println(p1.getPhones());
		System.out.println(p1.getPhones().getClass().getName());
		System.out.println("-------------------------------------------------------------");
		System.out.println(p1.getProps());
		System.out.println(p1.getProps().getClass().getName());
		System.out.println("-------------------------------------------------------------");
	}
}
