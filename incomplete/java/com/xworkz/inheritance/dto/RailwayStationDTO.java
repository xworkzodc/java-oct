package com.xworkz.inheritance.dto;

public class RailwayStationDTO extends PoliceStationDTO {

	public RailwayStationDTO(String area, int noOfCells, String name) {
		super(area, noOfCells, name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 46;
	}

}
