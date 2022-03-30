package com.springcore.reference;

public class University {
	
	private String name;
	private Student student;
	
	public University() {
		super();
	}

	public University(String name, Student student) {
		super();
		this.name = name;
		this.student = student;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", student=" + student + "]";
	}
	

}
