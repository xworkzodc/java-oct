package com.xworkz.exceptions.custom;

public class DuplicatePetException extends Exception{

	
	public DuplicatePetException(String message) {
		super(message);
	}
	
	public DuplicatePetException() {
	System.out.println("Default const of DuplicatePetException");
	}
	
}
