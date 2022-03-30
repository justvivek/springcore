package com.springcore.constructor.injection;

import java.util.List;

public class Person {
	
	private int id;
	private String name;
	private Certi cert;
	private List<String> courses;
	
	public Person(int id, String name, Certi cert, List<String> courses) {
		this.id = id;
		this.name = name;
		this.cert = cert;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cert=" + cert + ", courses" + courses +"]";
	}

	
	
	
	

}
