package com.xworkz.copies.init;

public class Paper {

	private String brand = "ClassMate";
	private String color;
	private int width;
	private int height;

	public Paper(String color, int width, int height) {
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	 void setWidth(int width) {
		this.width = width;
	}
	
	 void setHeight(int height) {
		this.height = height;
	}
	 
	 public int getHeight() {
		return height;
	}
	 
	 public int getWidth() {
		return width;
	}
}
