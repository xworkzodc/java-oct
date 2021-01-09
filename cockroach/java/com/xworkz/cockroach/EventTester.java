package com.xworkz.cockroach;

import com.xworkz.cockroach.event.ExceptionalEvent;

public class EventTester {
// Exception is an event which occurs during execution of program,
	//which disrupts normal flow
	public static void main(String[] args)throws Throwable {

		
		ExceptionalEvent event=new ExceptionalEvent();
		
		event.frame1();
		
	}

}
