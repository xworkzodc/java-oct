package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.PoliceStationDTO;
import com.xworkz.inheritance.dto.RailwayStationDTO;

public class RailwayStationTester {

	public static void main(String[] args) {

		RailwayStationDTO railwayStationDTO = new RailwayStationDTO("Yeshwantpur", 0, "YPR");

		RailwayStationDTO majestic = 
				new RailwayStationDTO("Majestic", 3, "YPR");
		System.out.println(majestic.equals(railwayStationDTO));
		System.out.println(System.identityHashCode(railwayStationDTO));
		System.out.println(System.identityHashCode(majestic));
		System.out.println(railwayStationDTO.hashCode());
		System.out.println(majestic.hashCode());
		
		System.out.println("*****************************");
		PoliceStationDTO policeStationDTO=
				new PoliceStationDTO("Vijaynagar", 4, "YPR");
		System.out.println(policeStationDTO.equals(majestic));
		System.out.println(policeStationDTO.hashCode());
		
	}

}
