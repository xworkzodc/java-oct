package com.xworkz.cockroach;

import com.xworkz.cockroach.dto.PlayerDTO;

public class CloneTester {

	public static void main(String[] args) throws CloneNotSupportedException {

		String name="Virat Kohli";
		int jersey=18;
		String sport="Cricket";
		
		
		PlayerDTO dto=new PlayerDTO();
		dto.setJerseyNumber(jersey);
		dto.setName(name);
		dto.setSport(sport);
		
		System.out.println(dto.getJerseyNumber());
		System.out.println(dto.getName());
		System.out.println(dto.getSport());
		
		PlayerDTO duplicate=new PlayerDTO();
		duplicate.setName(name);
		duplicate.setJerseyNumber(jersey);
		duplicate.setSport(sport);
	
		
		PlayerDTO duplicateClone=duplicate.clone();
		System.out.println(duplicateClone.getJerseyNumber());
		System.out.println(duplicateClone.getName());
		System.out.println(duplicateClone.getSport());
		
		
		
	}

}
