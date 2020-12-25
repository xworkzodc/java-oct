package com.xworkz.copies;

import com.xworkz.copies.frame.PhotoFrame;

public class PhotoFrameTester {

	public static void main(String[] args) {
	
		//creating/instantiating of an object
		PhotoFrame frame=new PhotoFrame();
		frame.companyName="Asha Arts";
		
		
		PhotoFrame natureFrame=new PhotoFrame();
		System.out.println(natureFrame.companyName);
		System.out.println(natureFrame.designedBy);
		System.out.println(natureFrame.size);
		System.out.println(natureFrame.color);
		int serialNo=5678;

	}

}
