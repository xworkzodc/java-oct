package com.xworkz.events.business;

import com.xworkz.events.exceptions.EmailValidationException;

public class Display {

	public void printEmail(String email) throws EmailValidationException {
		if (email != null) {
			if (email.contains("@") &&
					(email.contains(".com")|| email.contains(".in"))) {
				System.out.println("valid email");
				System.out.println(email);
			}
			else {
				throw new EmailValidationException("email should containt @ and .com or .in");
			}
		}
	}

}
