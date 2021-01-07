package com.xworkz.redbus.vrl;

import java.io.Serializable;

import com.xworkz.redbus.contract.RedbusContract;

public class RedbusContractImplementor implements RedbusContract {

	@Override
	public int minBooking() {
		System.out.println("invoked minBooking");
		return 20;
	}

	@Override
	public boolean busWarranty() {
		System.out.println("invoked busWarranty");
		return true;
	}

}
