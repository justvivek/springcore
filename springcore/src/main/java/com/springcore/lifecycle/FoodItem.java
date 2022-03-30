package com.springcore.lifecycle;

public class FoodItem {
	private double price;

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}
	
	
	public void hey() {
		System.out.println("Initialization inside FoodItem HEY!!!!!");
	}
	
	public void bye() {
		System.out.println("Destroy inside FoodItem bye bye !!!!!!");
	}
}
