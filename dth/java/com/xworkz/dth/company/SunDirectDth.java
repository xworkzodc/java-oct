package com.xworkz.dth.company;

import com.xworkz.dth.service.Dth;

public class SunDirectDth extends Dth {

	public SunDirectDth() {
	super();
	}
	
	@Override
	protected void connectionName() {
		System.out.println("invoked connectionName from SunDirectDth");
		super.connectionName();
	}
}
