package com.xworkz.inheritance.ecommerce;

public class Ecommerce {

	 protected boolean payOnDelivery;
	 private  String location="IND";
	 //with new /super
	 public Ecommerce() {
	System.out.println("Created Ecommerce ");
	}
	 
	 public String getLocation() {
		return location;
	}
	 
	 protected void setLocation(String location) {
		this.location = location;
	}
	 
	 
	 
	
}
