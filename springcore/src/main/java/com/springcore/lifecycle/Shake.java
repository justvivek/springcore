package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shake implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting shake price");
		this.price = price;
	}

	public Shake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shake(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shake [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking mango shake init");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Dumping shake glass destroy!!!!");
	}
	

}
