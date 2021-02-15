package com.xworkz.inheritance.amazon;

import com.xworkz.inheritance.ecommerce.Ecommerce;

public class AmazomEcommerce extends Ecommerce {

	public AmazomEcommerce(boolean payOnDelivery) {
		super();
		System.out.println("Created AmazomEcommerce");
		super.payOnDelivery = payOnDelivery;

	}

	public void changeLocation() {

	}

}
