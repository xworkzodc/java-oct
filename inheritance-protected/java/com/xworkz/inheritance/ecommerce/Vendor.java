package com.xworkz.inheritance.ecommerce;

public class Vendor {

	private Ecommerce ecommerce=new Ecommerce();;

	public Vendor(Ecommerce ecommerce) {
		this.ecommerce = ecommerce;
		System.out.println("Vendor created with ecommerce ");
	}

	public void delivery() {
		System.out.println("invoked delivery");
		System.out.println(ecommerce.payOnDelivery);
		ecommerce.setLocation("USA");
		System.out.println(ecommerce.getLocation());
		
	}

}
