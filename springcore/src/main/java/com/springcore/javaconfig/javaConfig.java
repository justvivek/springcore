package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	
	@Bean
	public Course getCourse() {
		Course course = new Course("Python");
		return course;
	}
	@Bean(name= {"stud", "dud", "temp"})
	public Student getStudent() {
		Student student = new Student("Ram", getCourse());
		return student;
	}
}
