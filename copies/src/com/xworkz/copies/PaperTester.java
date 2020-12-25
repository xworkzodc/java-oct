package com.xworkz.copies;

import com.xworkz.copies.init.Paper;

public class PaperTester {

	
	public static void main(String[] args) {
		
		Paper paper=new Paper("YELLOW",20,15);
		paper.setColor("BLUE");
		String brand=paper.getBrand();
		String color=paper.getColor();
		//all other properties and print it 
		System.out.println(brand);
		
		Paper paper1=new Paper("GREEN", 15, 20);
		
	}
}
