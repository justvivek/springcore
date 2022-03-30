package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sweet {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sweet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sweet(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sweet [name=" + name + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Sweet calling after initilization!!!");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Sweet ending after eating!!!!!!!");	
	}
	
}
