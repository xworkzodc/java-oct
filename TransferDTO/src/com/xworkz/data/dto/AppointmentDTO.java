package com.xworkz.data.dto;

public class AppointmentDTO {
	
	private String patientName;
	private long mobileNumber;
	private String reason;
	private int age;
	private String doctorName;
	
	public AppointmentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AppointmentDTO(String patientName, long mobileNumber, String reason, int age, String doctorName) {
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.reason = reason;
		this.age = age;
		this.doctorName = doctorName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	
	
}
