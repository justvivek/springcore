package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	//if we want to close the context then we need to use ClassPathXmlApplicationContext reference 
//	private static ClassPathXmlApplicationContext context;
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(javaConfig.class);
		
		Student s1 = context.getBean("dud", Student.class);
		System.out.println(s1);
		s1.study();
//		context.close();
		

	}

}
