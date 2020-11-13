package com.xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {

		
		System.out.println("JVM invoked main method");
		
		
		PocketMoneyEstimator.request(25, "Monday");
		PocketMoneyEstimator.request(100, "Tuesday");
		
		PocketMoneyEstimator.expenditure(40);
		
		PocketMoneyEstimator.request(50, "Wednesday");
		PocketMoneyEstimator.request(150, "Thursday");
		PocketMoneyEstimator.expenditure(90);
		System.out.println(PocketMoneyEstimator.getTotalAmount());
		System.out.println("EXIT :: main method");
	}

}
