package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * Annotation can be done in 3 ways
 * 1. Annotation on property
 * 2. Annotation on setter
 * 3. Annotation on Constructor
 * 
 * @Qualifier  -> is use to tell that when we are injecting reference in address then which
 * bean we are going to use, we will mention name of that bean
 * */
public class Emp {
	// 1 
	@Autowired 
	@Qualifier("address23")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 3
//	@Autowired 
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Setting using constructor");
	}

	public Address getAddress() {
		return address;
	}

	// 2 
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
