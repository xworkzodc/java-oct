package com.xworkz.inheritance.dto;

public class PoliceStationDTO extends Object {

	private String area;
	private int noOfCells;
	private String name;

	public PoliceStationDTO() {
		System.out.println("Created PoliceStationDTO");
	}

	/**
	 * @param area
	 * @param noOfCells
	 * @param name
	 */
	public PoliceStationDTO(String area, int noOfCells, String name) {
		super();
		this.area = area;
		this.noOfCells = noOfCells;
		this.name = name;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [area=" + area + ", noOfCells=" + noOfCells + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj == this) {// if obj and the current instance poiting to same obj
				System.out.println("obj pointing to same memory");
				return true;
			} else {
				if (obj instanceof PoliceStationDTO) {
					PoliceStationDTO casted = (PoliceStationDTO) obj;
					if (casted.getName() != null && casted.getName().equals(this.name)) {
						System.out.println("name is equal");
						return true;
					} else {
						System.out.println("name is not equal");
					}
				}
			}
		}
		System.out.println("obj is not equal");
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 45;
	}
	
	public String getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

}
