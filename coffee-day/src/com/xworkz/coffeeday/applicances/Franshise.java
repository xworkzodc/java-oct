package com.xworkz.coffeeday.applicances;

public class Franshise {

	private static String ownerName = "Rohan";
	private String location = "MG-ROAD";

	public String getLocation() {
		return location;
	}

	public static String getOwnerName() {
		return ownerName;
	}
	
	public static void displayOwnerAndLocation()
	{
		System.out.println(ownerName);
		//System.out.println(location);
	}

}
