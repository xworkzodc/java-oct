package com.xworkz.data;

import com.xworkz.data.dto.AppointmentDTO;
import com.xworkz.data.hospital.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		// any characters in the program donot resemable real person...only kalpanika
		Hospital hospital = new Hospital("Victoria", "City-Market");

		hospital.appointment("Rajashree", 9481827790l, 22, "Kall nali malle", "Dr.Priyanka");

		
		AppointmentDTO appointment=hospital.getAppointmentDTO();
		System.out.println("Patient Name :"+appointment.getPatientName());
		System.out.println("Doctor Name:"+appointment.getDoctorName());
		System.out.println("Patient Mobile number:"+appointment.getMobileNumber());
	}

}
