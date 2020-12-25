package com.xworkz.copies;

import com.xworkz.copies.frame.Camera;

public class CamereTester {

	public static void main(String[] args) {

		
		Camera camera1=new Camera();
		System.out.println(camera1.brand);
		camera1.brand="Nikon";
		System.out.println(camera1.brand);
		
		Camera camera2=new Camera();
		System.out.println(camera2.brand);
		camera2.brand="Canon";
		System.out.println(camera2.brand);
		
		System.out.println(camera1.type);
		camera2.type="COMPACT";
		System.out.println(camera2.type);
	}

}
