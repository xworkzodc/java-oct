package com.xworkz.coffeeday;

public class StringEquality {

	public static void main(String[] args) {

		String gadget = "";

		String gamingSystem = "";

		String device = "X-box";

		if (gadget == gamingSystem && gadget == device) {
			System.out.println("both ref pointing to same obj");
		} else {
			System.out.println("both ref poiting to different obj");
		}
		
		boolean value=gadget.equals(gamingSystem);
		System.out.println(value);
		
		boolean empty=gadget.isEmpty();
		System.out.println("empty "+empty);
System.out.println(device);
		String upperDevice=device.toUpperCase();
		System.out.println(upperDevice);
		device=device.toLowerCase();
		System.out.println(device);
		
		// Concatenation
		String concat=device+"Gaming";
		System.out.println(concat);
		String concatUsingMethod=device.concat("Virtual");
		System.out.println(device.concat("Super"));
		
		
		
	}

}
