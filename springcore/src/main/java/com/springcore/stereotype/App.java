package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		con = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		
		
	//Singleton Scope   
		Student s1 = con.getBean("s1", Student.class);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		Student s2 = con.getBean("s1", Student.class);
		System.out.println(s2.hashCode());
		
		System.out.println("----------------------------------------------");
		Teacher t1 = con.getBean("t1", Teacher.class);
		System.out.println(t1);
		System.out.println(t1.hashCode());
		
		Teacher t2 = con.getBean("t1", Teacher.class);
		System.out.println(t2);
		System.out.println(t2.hashCode());
		
	}

}
