package com.xworkz.coffeeday;

import com.xworkz.coffeeday.applicances.Power;

public class EqualityTester {

	public static void main(String[] args) {

		Power power = new Power();

		Power power2 = new Power();

		if (power == power2) {
			System.out.println("power poiting to same instance");
		} else {
			System.out.println("power is not pointing to same instance");
		}

	boolean value=	power.equals(power2);
	System.out.println(value);
		
	}

}
