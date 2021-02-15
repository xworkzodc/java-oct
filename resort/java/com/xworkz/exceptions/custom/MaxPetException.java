package com.xworkz.exceptions.custom;

public class MaxPetException extends RuntimeException {

	public MaxPetException() {
		System.out.println("default MaxPetException");
	}

	public MaxPetException(String message) {
		super(message);
	}
}
