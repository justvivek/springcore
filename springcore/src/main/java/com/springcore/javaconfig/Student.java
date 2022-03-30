package com.springcore.javaconfig;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

//@Component
public class Student {

	private String name;
	
	private Course course;

	public Student(String name, Course course) {
		super();
		this.name = name;
		this.course = course;
	}

	public void study() {
		course.display();
		System.out.println("Student is Studying");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}
