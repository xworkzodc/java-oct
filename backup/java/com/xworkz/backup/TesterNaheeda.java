package com.xworkz.backup;

import com.xworkz.backup.dto.AwardDTO;

public class TesterNaheeda {

	public static void main(String[] args) {

		
		AwardDTO dto = new AwardDTO();
		dto.setName("OSCAR");
		dto.setType("CIVIL");
		dto.setWinnerName("Gonuguntla");
		dto.setReasonForAward("NAME IS BIG");

		System.out.println(dto);

		AwardDTO dto1 = new AwardDTO();
		dto1.setName("OSCAR");
		dto1.setType("CIVIL");
		dto1.setWinnerName("Gonuguntla");
		dto1.setReasonForAward("UNIQUE SUR NAME");
		System.out.println(dto1);
System.out.println(dto.hashCode()==dto1.hashCode());
		boolean equal=dto.equals(dto1);
		System.out.println(equal);
		//equals
		// check if two awards are same or not

		// hashCode is same and equals return true
			
		
	}

}
