package com.xworkz.basics;

public class PersonalInfoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//datatypes which is non-primitive-----class , enum, []
		String firstName="Xworkz";
		boolean empty=firstName.isEmpty();
		System.out.println(empty);
		
		String lastName="Xworkz";
		
		String fullName=firstName+lastName;		
		System.out.println(fullName);			
		String partName=fullName.substring(4);
		System.out.println(partName);
		//kzodcDev Center
		String concatinated=partName.concat("Dev Center");
		System.out.println(partName);
		System.out.println(concatinated);
	
		
		// ==---> two ref are poiting to same value
		if(firstName==lastName)
		{
			System.out.println("first name is poiting to same as last name ");
		}
		else {
			System.out.println("first name is not pointing to same as last name ");
		}
		
		int a =8;
		int b=18;
		if(b==a)
		{
			System.out.println("ref points to same memory location");
		}
		else {
			System.out.println("ref points to different  memory location");
		}
		
	}

}
