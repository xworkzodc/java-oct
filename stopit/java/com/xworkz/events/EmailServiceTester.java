package com.xworkz.events;

import com.xworkz.events.business.EmailService;

public class EmailServiceTester {

	public static void main(String[] args) {
		
		EmailService service = new EmailService();
		//service.setEmailLimit(100);
		service.addEmail("contact@x-workz.in");
		service.addEmail("veeresh.xworkz@gmail.com");
		service.addEmail("sahana.xworkz@gmail.com");
		service.addEmail("om.bn@outlook.com");
	}

}
