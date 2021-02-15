package com.xworkz.exceptions.service;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.exceptions.custom.DuplicatePetException;
import com.xworkz.exceptions.custom.MaxPetException;

public class PetService {

	private Map<String, String> map;
	private int maxPets = 3;

	public PetService() {
		System.out.println("Created PetService");
		this.map = new HashMap<String, String>();
	}

	public void addPet(String petName, String ownerName) throws DuplicatePetException {
		System.out.println("invoked addPet");
		System.out.println("arg1" + petName);
		System.out.println("arg2" + ownerName);
		System.out.println(this.totalSize());
		if (this.map.size() < this.maxPets) {
			boolean alreadyContains = this.map.containsKey(petName);
			System.out.println("can add pet, " + alreadyContains);
			if (!alreadyContains) {
				this.map.put(petName, ownerName);
			} else {
				throw new DuplicatePetException();
			}
		} else {
			System.out.println("cannot add more pets");
			
			throw new MaxPetException("Max pets to add is only "+this.maxPets);
		}

	}

	public int totalSize() {
		return this.map.size();
	}

}
