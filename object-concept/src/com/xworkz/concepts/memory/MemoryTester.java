package com.xworkz.concepts.memory;

public class MemoryTester {

	
	static String fruit;
	boolean working;
	
	
	public static void main(String[] args) {
		/*
		 * System.out.println("this is main method"); String name="xworkz";
		 * 
		 * name.toUpperCase();
		 * 
		 * showDate();
		 * 
		 * showDay();
		 */
		StaticMemoryTester.displayInfo();
	}
	
	
	public static void showDate()
	{
		System.out.println("23-Nov-2020");
		showDay();
	}
	
	
	public static void showDay()
	{
		System.out.println("MONDAY");
		
		Integer.parseInt("23");
	}
	
}
