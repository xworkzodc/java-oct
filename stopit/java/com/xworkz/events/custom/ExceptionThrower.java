package com.xworkz.events.custom;

public class ExceptionThrower {

	public void checked() throws CustomCheckedException {

		throw new CustomCheckedException("this is testing checked");

	}

	public void unchecked() {

		throw new CustomUnCheckedException("testing un checked");
	}

}
