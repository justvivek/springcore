package com.springcore.constr.injec.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/springcore/constr/injec/ambiguity/ciconfig.xml");
		
		Addition sum = context.getBean("add1", Addition.class);
		sum.doSum();
		
		Addition sum2 = context.getBean("add2", Addition.class);
		sum2.doSum();
		
	}

}
