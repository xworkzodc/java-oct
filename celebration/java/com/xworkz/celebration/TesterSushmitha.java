package com.xworkz.celebration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesterSushmitha {

	public static void main(String[] args) {

		Set<String> favouritePlaces = new HashSet<String>();
		favouritePlaces.add("Paris");
		favouritePlaces.add("Mauritius");
		favouritePlaces.add(null);
		favouritePlaces.add(null);
		favouritePlaces.add("Bali");
		favouritePlaces.add("Munnar");
		favouritePlaces.add("La");
		favouritePlaces.add("Aus");
		favouritePlaces.add("Paris");
		favouritePlaces.add("Tirupati");
		favouritePlaces.add("Malasyia");
		favouritePlaces.add("Shivamoga");
		favouritePlaces.add("Goa");
		favouritePlaces.add("Malasyia");

		System.out.println(favouritePlaces.size());
		favouritePlaces.forEach(e->System.out.println(e));
	}

}
