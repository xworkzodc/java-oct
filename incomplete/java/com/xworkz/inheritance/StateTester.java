package com.xworkz.inheritance;

import com.xworkz.inheritance.scheme.UnionGovernment;
import com.xworkz.inheritance.states.KarnatakaGovernment;
//jvm
public class StateTester {

	public static void main(String[] args) {

		UnionGovernment government=new KarnatakaGovernment() ;
		government.atalPensionYogana();
		
		
		Number number=new Integer(56);
		number =new Double(78);
		//abstract met
		
		
		
		
	}

}
