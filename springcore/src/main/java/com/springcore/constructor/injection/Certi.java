package com.springcore.constructor.injection;

public class Certi {

	private String name;

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Using setter injection");
		this.name = name;
	}

	public Certi(String name) {
		super();
		this.name = name;
	}

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
