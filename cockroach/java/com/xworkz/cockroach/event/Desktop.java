package com.xworkz.cockroach.event;

public class Desktop {

	public void connectToInternet(String operator) {
		String op = null;
		try {
			op = operator.toUpperCase();
			Integer value = Integer.parseInt("t");
		} catch (NullPointerException | NumberFormatException exe) {
			System.out.println("NullPointerException in connectToInternet");
			op = "DEFAULT";
		} catch (ClassCastException cast) {
			System.out.println("ClassCastException in connectToInternet");
		} catch (Exception e) {
			System.out.println("exception in connectToInternet");
		}

		System.out.println(op);
	}

	public void power(boolean available) {
		if (available) {
			System.out.println("desktop can connect");
		} else {
			throw new IllegalArgumentException("power not there, should be true");
		}
	}

}
