package com.xworkz.redbus.contract;

import java.io.Serializable;
import java.util.Date;

public interface RedbusContract extends Serializable{

	public int minBooking();

	 boolean busWarranty();

	public  static void printDate()
	{
		System.out.println(new Date());
	}
	
}
