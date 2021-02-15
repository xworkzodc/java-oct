package com.xworkz.exceptions;

import java.util.LinkedList;

import com.xworkz.exceptions.custom.DuplicatePetException;

public class SkandaTester {
	
	
	public static void main(String[] args) throws DuplicatePetException {
		
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Ok");
		linkedList.add("not working");
		linkedList.add("friday");
		
		LinkedList<String> linkedList1=new LinkedList<String>();
		linkedList1.add("Monday");
		linkedList1.add("Wednesday");
		
		
		linkedList.addAll(linkedList1);
		
		linkedList.add("saturday");
		linkedList.add("Maths");
		
		
		
		
		
		
		
	}

}
