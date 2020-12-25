package com.xworkz.coffeeday.applicances;

public class CoffeeMachine {

	private Power power;
	
	private double price;
	
	private String[] value;

	public CoffeeMachine(Power power) {
		System.out.println("Init CoffeeMachine");
		this.power = power;
	}

	/**
	 * This method takes bean , and grinds . If Grinding is success returns true
	 * else false
	 * 
	 * @param String beanName
	 * @return boolean
	 */
	public boolean grind(String bean) {
		System.out.println("invoked grind");
		if (bean != null) {
			boolean generated = this.power.generatePower();
			if (generated) {
				System.out.println("grinding" + bean);
				return true;
			} else {
				System.out.println("not griding");
				return false;
			}
		} else {
			System.out.println("bean is not there");
			return false;
		}
	}

}
