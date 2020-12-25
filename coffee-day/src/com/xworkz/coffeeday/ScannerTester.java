package com.xworkz.coffeeday;

//ctrl+shift+o
public class ScannerTester {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String virus="Corona";
		//s -static
		//f= final
		int sizeOfCharArray=virus.length();
		char c=virus.charAt(3);
		System.out.println(c);
		
		System.out.println(sizeOfCharArray);
		
		
		char[] chars=virus.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			System.out.println(chars[i]);
		}
		
		virus="Novel"+virus;
		
		
		
		
		
	}

}
