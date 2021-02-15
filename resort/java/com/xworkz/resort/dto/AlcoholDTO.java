package com.xworkz.resort.dto;

public class AlcoholDTO {

	private String brand;
	private AlcoholType type;

	public enum AlcoholType {
		WINE, BEER, RUM
	}

	private double price;

	/**
	 * @param brand
	 * @param type
	 * @param price
	 */
	public AlcoholDTO(String brand, AlcoholType type, double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public AlcoholType getType() {
		return type;
	}

	public void setType(AlcoholType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
