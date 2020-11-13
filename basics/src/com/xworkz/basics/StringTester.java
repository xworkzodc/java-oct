package com.xworkz.basics;


public class StringTester{
	
	
	public static void main(String[] args) {
		System.out.println("invoked main by JVM");
		
		//String, String is special in java
		//char ----char[]
		//char primitive---> methods
		//String---Class---->Methods and Fields
		//two ways to create String. a. Literals, new keyword
		//String is an Object
		
		String countryName;
		countryName="India";
		System.out.println(countryName);
		int sizeOfCountryName=countryName.length();
		System.out.println(sizeOfCountryName);
		
		countryName=countryName.toUpperCase();
		
		System.out.println(countryName);
		
		countryName.toLowerCase();
		System.out.println(countryName);
		
		char alphabet=countryName.charAt(3);
		System.out.println(alphabet);
		
		countryName="India";
		String myCountry="India";
		
		String kavyasCountry="IndiA";
		
		String madhusCountry="IndiA";
		
		System.out.println("Exit :: main");
		
		myCountry="USA";
		
		
		
	}
	
	
}