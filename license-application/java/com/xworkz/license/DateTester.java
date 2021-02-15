package com.xworkz.license;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTester {

	public static void main(String[] args) throws ParseException {
		System.out.println(Runtime.getRuntime().availableProcessors());
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		String stringDate = format.format(date);
		System.out.println(stringDate);

		// System.out.println(date2);
		String result = "ok";
		String result1 = "ok1";
		if (result.equals("ok") & result1.equals("ok2")) {
			System.out.println("working");

		}
	}

}
