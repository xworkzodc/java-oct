package com.xworkz.inheritance.states;

import com.xworkz.inheritance.scheme.UnionGovernment;

public class KarnatakaGovernment extends UnionGovernment {

	public KarnatakaGovernment() {
		System.out.println("Created KarnatakaGovernment");
	}

	@Override
	public void ayushmanBharat() {
		System.out.println("invoked ayushmanBharat");

	}

}
