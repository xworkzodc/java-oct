package com.xworkz.rules;

import com.xworkz.rules.lockdown.CoronaLockDown;
import com.xworkz.rules.lockdown.CoronaLockDownImplementor;

public class LockDownTester {

	public static void main(String[] args) {

		CoronaLockDown coronaLockDown=new CoronaLockDownImplementor();
		System.out.println(CoronaLockDown.COUNTRY);
		String sanitiser=coronaLockDown.sanitize();
		System.out.println(sanitiser);
		coronaLockDown.wearMask();
		int distance=coronaLockDown.socailDistance();
		System.out.println(distance);
	}

}
