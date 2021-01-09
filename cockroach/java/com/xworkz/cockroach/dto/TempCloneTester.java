package com.xworkz.cockroach.dto;

public class TempCloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		String name="Virat Kohli";
		int jersey=18;
		String sport="Cricket";
		
		
		PlayerDTO dto=new PlayerDTO();
		dto.setJerseyNumber(jersey);
		dto.setName(name);
		dto.setSport(sport);
		System.out.println(dto.hashCode());
		
		PlayerDTO cloned=dto.clone();
		System.out.println(cloned.hashCode());
		System.out.println(cloned.getJerseyNumber());
		System.out.println(cloned.getName());
		System.out.println(cloned.getSport());
	}

}
