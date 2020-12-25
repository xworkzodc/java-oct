package com.xworkz.copies.constructor;

public class Fruit {

	public String name;
	public double price;

	public Fruit(String name) {
		System.out.println("Created Fruit");
		this.name = name;
	}

	public Fruit() {
		System.out.println("default const");
	}
	public Fruit(String name,double price) {
		
		System.out.println("invoked name and price constructor");
		//this will give ref of current instance. With in class
		this.name=name;
		this.price=price;
		
	}

}
