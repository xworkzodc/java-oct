package com.xworkz.rules.lockdown;

public class CoronaLockDownImplementor implements CoronaLockDown {

	
	@Override
	public int socailDistance() {
		System.out.println("implemented socailDistance");
		return 6;
	}

	@Override
	public void wearMask() {
		System.out.println("implemented wearMask");
	}

	@Override
	public String sanitize() {
		System.out.println("implemented sanitize");
		return "Dettol";
	}

}
