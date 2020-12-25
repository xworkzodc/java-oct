package com.xworkz.copies.constructor;

public class Bike {

	//compiler checks . 
	
	public String color="BLACK";
	
	public Bike(String bikeColor)
	{
		System.out.println("invoked Bike Constructor");
		System.out.println("arg 1 :" +bikeColor);
		System.out.println("value of instance var before assign");
		System.out.println("instane var value is :"+color);
		System.out.println("assign arg to instance var");
		color=bikeColor;
		System.out.println("instane var value is :"+color);
		
		
	}
	
}
