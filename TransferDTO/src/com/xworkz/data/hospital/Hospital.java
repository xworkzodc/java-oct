package com.xworkz.data.hospital;

import com.xworkz.data.dto.AppointmentDTO;

public class Hospital {
	private String name;
	private String location;
	private int appointmentSlots = 5;
	private AppointmentDTO appointmentDTO;

	public Hospital(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	
	public void appointment(String name, long mobile, int age, String reason, String doctorName) {

		//this.appointmentDTO = new AppointmentDTO(name, mobile, reason, age, doctorName);
		this.appointmentDTO=new AppointmentDTO();
		this.appointmentDTO.setAge(age);
		this.appointmentDTO.setDoctorName(doctorName);
		
		

	}

	
	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}
}
