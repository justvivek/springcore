package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")
@Scope("prototype")
public class Student {
	@Value("Alpha")
	private String name;
	@Value("SpringCore")
	private String course;
	
	
	//Using Collection with Value annotation using spring Expression Language
	
	@Value ("#{addr}")
	private List<String> addresses;
	
	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Student(String name, String course, List<String> addresses) {
		super();
		this.name = name;
		this.course = course;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", addresses=" + addresses + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
 
}
