package com.xworkz.data;

import java.util.Arrays;
import java.util.Date;

import com.sun.prism.impl.ps.BaseShaderContext.SpecialShaderType;
import com.xworkz.data.constants.Color;
import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.SweetDTO;

public class SweetDTOTester {

	
	public static void main(String[] args) {
		
		
		String[] color=new String[4];
		color[0]="Boat";
		//color[1]="White";
		//color[2]="Green";
		//color[3]="Yellow";
		
		SweetDTO dto=new SweetDTO("Ladoo", color, Shape.ROUND);
		dto.setPopularState("Tirupati");
		dto.setPrice(600);
		
		System.out.println(dto.getShape());
		System.out.println(Arrays.toString(dto.getColor()));
		
		
		SweetDTO dto2=new SweetDTO("Champakali", 450, "Bengal");
		dto2.setShape(Shape.CYLINDER);
		Color[] colors=new Color[2];
		colors[0]=Color.WHITE;
		colors[1]=Color.YELLOW;
		
		dto2.setColors(colors);
		
		
		Date date=new 
	}
}
