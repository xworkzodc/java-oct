package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;
import com.xworkz.bakery.browser.Firefox;

public class FireFoxTester {

	public static void main(String[] args) {

		Object generic=new Firefox();
		
		Browser browser=new Firefox();
	
		Firefox firefox=new Firefox();
		
		

		//it is illegal Browser child=new Object();
		
		//instanceOf
		generic=new String("test");
		if(generic instanceof Firefox)
		{
			System.out.println("yes it is fire fox");
			Firefox fireFoxCasted=(Firefox)generic;
			System.out.println(firefox.getName());

		}
		else {
			System.out.println("it is not fire fox");
		}
		
		
		
	}

}
