package com.xworkz.inheritance;

import com.xworkz.inheritance.amazon.AmazomEcommerce;

public class VendorTester {

	public static void main(String[] args) {

		
		AmazomEcommerce amazon=new AmazomEcommerce(true);
		System.out.println(amazon.getLocation());
		amazon.changeLocation();
		System.out.println(amazon.getLocation());
		
		
	}

}
