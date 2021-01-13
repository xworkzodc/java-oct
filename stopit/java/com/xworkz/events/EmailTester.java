package com.xworkz.events;

import com.xworkz.events.business.Display;
import com.xworkz.events.exceptions.EmailValidationException;

public class EmailTester {

	public static void main(String[] args) {

		Display display=new Display();
		
		try {
			display.printEmail("contact@x-workz.in");
		} catch (EmailValidationException e) {
			e.printStackTrace();
		}
		
	}

}
