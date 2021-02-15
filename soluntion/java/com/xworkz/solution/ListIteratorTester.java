package com.xworkz.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTester {

	public static void main(String[] args) {

		List<String> monuments = new ArrayList<String>();
		monuments.add("Taj Mahal");
		String charMinar = "Char Minar";
		monuments.add(charMinar);
		monuments.add("Statue Of Unity");
		monuments.add("Vidhana Souda");
		monuments.add("Mysore Palace");
		monuments.add("Hampi");

		ListIterator<String> listIterator = monuments.listIterator(2);
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println(listIterator.previousIndex());
		System.out.println("============================");
		// ListIterator<String> listPrevIterator = monuments.listIterator(2);
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
