package com.xworkz.cockroach;

import com.xworkz.cockroach.event.Desktop;

public class DesktopTester {

	public static void main(String[] args) {

		Desktop desktop = new Desktop();

		// desktop.connectToInternet("Airtel");
		try {
			System.out.println("before power");
			desktop.power(false);
			System.out.println("after power");
		} catch (Exception refOfException) {
			System.err.println("exceotion in desktop power");
			System.err.println(refOfException.getMessage());
			refOfException.printStackTrace();
		}

	}

}
