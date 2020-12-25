package com.xworkz.copies;

import com.xworkz.copies.constructor.Fruit;

public class FruitTester {
	
	public static void main(String[] args) {
		
		Fruit fruit=new Fruit("Mango");
		String fruitName=fruit.name;
		System.out.println(fruitName);
		
		Fruit fruit2=new Fruit();
		fruitName=fruit2.name;
		fruitName=fruit2.name="Banana";
		System.out.println(fruitName);
		
		
		Fruit fruit3=new Fruit("Apple",100);
		System.out.println(fruit3.name);
		System.out.println(fruit3.price);
		
		
		
		
		
	}

}
