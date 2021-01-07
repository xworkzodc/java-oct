package com.xworkz.redbus;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.temp.ExceptionalEvent;

public class ExceptionTester {

	public static void main(String[] args) throws CloneNotSupportedException {

		ExceptionalEvent event = new ExceptionalEvent();

		// event.stack1(true);
TravelAgency agency=new TravelAgency(null);
TravelAgency cloned=(TravelAgency) agency.clone();
System.out.println(cloned.getAgencyName());
		// event.error();
		try {
			Handler handler = new FileHandler("OutFile.log");
			Logger.getLogger("").addHandler(handler);
			event.stack1(true);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			 Logger logger = Logger.getLogger(""); 
			    StackTraceElement elements[] = e.getStackTrace();
			    for (int i = 0, n = elements.length; i < n; i++) {
			        logger.log(Level.WARNING, elements[i].getMethodName());
			    }
		}
		// event.runTimeException();

	}

}
