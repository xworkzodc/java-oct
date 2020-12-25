package com.xworkz.data.hospital;

import com.xworkz.data.dto.ICUAdmissionDTO;

public class ICU {

	private boolean ventilatorAvailable;
	private double costPerDay;
	private boolean tvAvailable;
	private ICUAdmissionDTO admissionDTO;

	public ICU() {
		System.out.println("Created ICU");
	}

	public ICU(boolean ventilatorAvailable, double costPerDay, boolean tvAvailable) {
		super();
		this.ventilatorAvailable = ventilatorAvailable;
		this.costPerDay = costPerDay;
		this.tvAvailable = tvAvailable;
	}

	// admission details-----name,severity,doctorAssigned,nurseAssigned

	public void addmissionDetails(String patientName, String severity, String doctorAssigned, String nurseAssigned) {
		if (patientName != null && severity != null && doctorAssigned != null && nurseAssigned != null) {
			System.out.println("Details are validted , can create admission");
			this.admissionDTO = new ICUAdmissionDTO(patientName, severity, doctorAssigned, nurseAssigned);
			System.out.println("created admission");
		} else {
			System.out.println("cannot create an admission cause of null");
			this.admissionDTO = null;
		}

	}

	public void updateDoctor(String newDoctorName) {
		this.admissionDTO.setDoctorName(newDoctorName);
	}

	public ICUAdmissionDTO getAdmissionDTO() {
		return admissionDTO;
	}

}
