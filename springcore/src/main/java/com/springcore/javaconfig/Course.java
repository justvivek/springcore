package com.springcore.javaconfig;

public class Course {
	
	private String name;
	
	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void display() {
		System.out.println("Student is studying "+ name);
	}
}
