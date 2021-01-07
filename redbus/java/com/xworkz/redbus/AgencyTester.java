package com.xworkz.redbus;

import java.io.Serializable;

import com.xworkz.redbus.agency.TravelAgency;
import com.xworkz.redbus.contract.RedbusContract;
import com.xworkz.redbus.vrl.RedbusContractImplementor;

public class AgencyTester {

	public static void main(String[] args) {

		//any type ---class or interface--use ....methods of obj is provided 
		RedbusContract contract=new RedbusContractImplementor();
		
		Serializable obj=new RedbusContractImplementor();
     
     
		
		RedbusContract.printDate();
		//abstraction	
		TravelAgency agency=new TravelAgency(contract);
		
		agency.acceptBooking();
		
	}

}
