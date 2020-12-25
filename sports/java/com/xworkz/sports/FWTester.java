package com.xworkz.sports;

import com.xworkz.sports.constants.FootWearType;
import com.xworkz.sports.footwear.FootWear;
import com.xworkz.sports.footwear.ShoeFootWear;

public class FWTester {

	public static void main(String[] args) {
		FootWear footWear;// new SandalFootWear();

		ShoeFootWear shoeFootWear = new ShoeFootWear();

		shoeFootWear.setBrand("Adidas");
		shoeFootWear.setSize(7);
		shoeFootWear.setPrice(2000);
		shoeFootWear.setFootWearType(FootWearType.SPORTS);

		shoeFootWear.displayDetails();

		double dis = shoeFootWear.calculateDiscount();
		System.out.println(dis);

		if (shoeFootWear instanceof ShoeFootWear) {
			System.out.println("is it instance of footwear");
		}

	}

}
