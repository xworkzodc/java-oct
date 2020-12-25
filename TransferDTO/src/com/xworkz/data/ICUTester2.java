package com.xworkz.data;

import com.xworkz.data.dto.ICUAdmissionDTO;
import com.xworkz.data.hospital.ICU;

public class ICUTester2 {

	public static void main(String[] args) {

		ICU icu = new ICU(true, 2000, true);
		icu.addmissionDetails(null, null, null, null);
		ICUAdmissionDTO admissioDTO = icu.getAdmissionDTO();
		if (admissioDTO != null) {
			System.out.println(admissioDTO.getDoctorName());
			System.out.println(admissioDTO.getNurseAssigned());
			System.out.println(admissioDTO.getPatientName());
			System.out.println(admissioDTO.getSeverity());
		} else {
			System.out.println("admission is null");
		}

	}

}
