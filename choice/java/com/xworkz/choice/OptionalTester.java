package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dto.WonderDTO;
import com.xworkz.choice.dto.WonderDTO.WonderType;

public class OptionalTester {

	public static void main(String[] args) {

		WonderDTO dto = new WonderDTO();
		dto.setName("");
		dto.setPlace("Egypt");
		dto.setPeriod(WonderType.BC);

		// Optional<String> optHesaru=Optional.of("Pyramid");
		dto.setHesaru(Optional.of("Pyramid"));

		String name = dto.getName();

		System.out.println(name.toLowerCase());

		Optional<String> temp = dto.getHesaru();
		System.out.println(temp.isPresent());
		temp.ifPresent(v -> System.out.println(v));

		String nameTemp = temp.get();
		if (nameTemp.contains("y")) {
			System.out.println("y is found");
		}

		temp.filter(v -> v.contains("y"))
				.ifPresent(v -> System.out.println("y is found"));

		// map

		String upperName = temp.map(v -> v.toUpperCase()).get();
		System.out.println(upperName);

		temp.filter(v -> true).map(v -> v.toUpperCase())
				.ifPresent(v -> System.out.println(v + "y is uper case"));

		String mapped = temp.map(v -> "converted").get();
		System.out.println(mapped);

		WonderDTO dto1= temp.flatMap(v -> Optional.of(new WonderDTO())).get();
		System.out.println(dto1);

	}

}
