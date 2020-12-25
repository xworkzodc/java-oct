package com.xworkz.data.dto;

import com.xworkz.data.constants.Color;
import com.xworkz.data.constants.Shape;

public class SweetDTO {

	private String name;
	private double price;
	private String popularState;
	@Deprecated
	private String[] color;
	private Shape shape;
	private Color[] colors;

	public SweetDTO() {
		System.out.println("Created SweetDTO using no-arg");
	}

	public SweetDTO(String name, double price, String popularState) {
		super();
		this.name = name;
		this.price = price;
		this.popularState = popularState;
	}

	public SweetDTO(String name, String[] color, Shape shape) {
		super();
		this.name = name;
		this.color = color;
		this.shape = shape;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPopularState() {
		return popularState;
	}

	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}
	@Deprecated
	public String[] getColor() {
		return color;
	}
	@Deprecated
	public void setColor(String[] color) {
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Color[] getColors() {
		return colors;
	}

	public void setColors(Color[] colors) {
		this.colors = colors;
	}


}
