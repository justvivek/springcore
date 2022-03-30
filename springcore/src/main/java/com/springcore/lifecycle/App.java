package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
//	private static ApplicationContext context;
	private static AbstractApplicationContext context; //to call destroy method we need to use AbstractApplicationContext 
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
//		FoodItem item1 = context.getBean("burger", FoodItem.class);
//		System.out.println(item1);
//		//registering shutdown hook
		context.registerShutdownHook(); // help us to call destroy method
//		
//		Shake item2 = context.getBean("mango", Shake.class);
//		System.out.println(item2);
		
		Sweet s1 = context.getBean("sweet1", Sweet.class);
		System.out.println(s1);
		
	}
}
