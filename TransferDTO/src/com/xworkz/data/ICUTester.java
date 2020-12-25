package com.xworkz.data;

import com.xworkz.data.dto.ICUAdmissionDTO;
import com.xworkz.data.hospital.ICU;

public class ICUTester {
	
	public static void main(String[] args) {
		
		
		ICU icu;
		icu=new ICU(true,1000,false);
		icu.addmissionDetails("Kavya", "Eye Sight", "Joshi", "Anita");
		ICUAdmissionDTO dto=icu.getAdmissionDTO();
		System.out.println(dto.getPatientName());
		System.out.println(dto.getDoctorName());
		icu.updateDoctor("Vishalaxi Patil");
		System.out.println(dto.getDoctorName());
		//icu.getAdmissionDTO().setDoctorName("Aishwarya");
		System.out.println(dto.getDoctorName());
	}

}
