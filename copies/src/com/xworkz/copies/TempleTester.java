package com.xworkz.copies;

import com.xworkz.copies.init.Temple;

public class TempleTester {
	
	public static void main(String[] args) {
		
		//class is a custom/non-primitive data type
		
		Temple temple;
		
		temple=new Temple("Sai-baba","Gadag",6.00f,"puliyogare",8.00f);
		//debug
		String name =temple.getName();
		String location=temple.getLocation();
		//float startime=temple.getOpenTime();
		//float closing=temple.getCloseTime();
		String prasad=temple.getPrasada();
		
		//System.out.println(startime);
		//System.out.println(closing);
		temple.setPrasada("laadu");
		prasad=temple.getPrasada();
		
		
		
		
		
	}

}
