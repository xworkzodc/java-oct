package com.xworkz.interview;

import com.xworkz.interview.inheritance.Person;

public class Tester {

	public static void main(String[] args) {

		
		Person person=new Person();
		person.setEmail("om");
		person.setName("om");
		System.out.println(person.hashCode());
		System.out.println(System.identityHashCode(person));

		
		Person person1=new Person();
		person1.setEmail("om");
		person1.setName("om");
		System.out.println(person.equals(person1));
		System.out.println(person1.hashCode());
	}

}
