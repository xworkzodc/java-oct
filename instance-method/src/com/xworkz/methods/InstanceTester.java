package com.xworkz.methods;

import com.xworkz.methods.theater.Customer;

public class InstanceTester {
	
	public static void main(String[] args) {
		
		
		Customer customer=new Customer();
		String name=customer.getName();
		customer.setName("Nikita");
		System.out.println(customer.getName());
	}

}
