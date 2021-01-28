package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.constants.Shade;

public class CosmeticDTO implements Comparable<CosmeticDTO> {

	private String brand;
	private Shade shade;
	private CosmeticType cosmeticType;
	private double price;// >0 ,
	private int quantity;// >0 < =100

	public CosmeticDTO() {

	}

	/**
	 * @param brand
	 * @param shade
	 * @param cosmeticType
	 * @param price
	 * @param quantity
	 */
	public CosmeticDTO(String brand, Shade shade, CosmeticType cosmeticType, double price, int quantity) {
		super();
		this.brand = brand;
		this.shade = shade;
		this.cosmeticType = cosmeticType;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Shade getShade() {
		return shade;
	}

	public void setShade(Shade shade) {
		this.shade = shade;
	}

	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}

	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shade=" + shade + ", cosmeticType=" + cosmeticType + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO casted = (CosmeticDTO) obj;
			if (this.brand != null && this.cosmeticType != null) { // MAYbelline null
				if (this.brand.equals(casted.getBrand()) && this.cosmeticType.equals(casted.cosmeticType)) {
					System.out.println("CosmeticDTO is equal");
					return true;
				}
			}
		}
		System.out.println("CosmeticDTO is not equal");
		return false;
	}

	@Override
	public int compareTo(CosmeticDTO arg) {
		
		if (this.quantity < arg.quantity) {
			return -1;
		}
		if (this.quantity == arg.quantity) {
			return 0;
		}
		if (this.quantity > arg.quantity)
			return 1;
		return 0;
	}

}
