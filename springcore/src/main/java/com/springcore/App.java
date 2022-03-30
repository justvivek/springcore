package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student s1 = context.getBean("student1",Student.class);
    	System.out.println(s1);
    	
    	Student s2 = context.getBean("student2", Student.class);
    	System.out.println(s2);
    	
    	Student s3 = context.getBean("student3", Student.class);
    	System.out.println(s3);
    }
}
