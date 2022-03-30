package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/reference/configref.xml");
		
		University univer = context.getBean("Univer", University.class);
		
		System.out.println(univer);
		System.out.println(univer.getStudent());
		System.out.println(univer.getClass().getName());
		System.out.println(univer.hashCode());
	}

}
