package com.xworkz.sports;

import com.xworkz.sports.award.Ceremony;

public class CemeronyTester {

	public static void main(String[] args) {

		Ceremony ceremony=new Ceremony("Agadi Fest");
		
		String[] foodItems= {"Jamoon","Kaju Barfi","Pepper Chicken","Fried Rice","Mysore Pak"};
		
		ceremony.setFoods(foodItems);
		//ref
		ceremony.distributeAward("Nikita", "Oscar");
		
		//ceremony.displayFoods();
		ceremony.displayCeremoryNameAndFoods();
		
		ceremony.accessParentMembers();
		
		int code=ceremony.hashCode();
		System.out.println(code);
		
	}

}
