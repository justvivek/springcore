package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
	    context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee emp1 = context.getBean("emp1", Employee.class);
		
//		System.out.println(emp1);
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProps());
		
		System.out.println(emp1.getPhone().getClass().getName());
	}

}
