package com.xworkz.carshowroom;

import com.xworkz.carshowroom.showroom.CarShowRoom;
import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;

public class CarTester {

	public static void main(String[] args) {

		CarShowRoom carShowRoom = new CarShowRoom();

		CarDTO dto = new CarDTO();
		dto.setModel("Tesla");
		dto.setVariant(CarVariant.MID);
		dto.setPrice(2000000);

		carShowRoom.addCar(dto);

		CarDTO dto2 = new CarDTO("Swift", 600000, CarVariant.TOP);

		carShowRoom.addCar(dto2);

		CarDTO dto3 = new CarDTO("Jeep", 2800000, CarVariant.TOP);

		carShowRoom.addCar(dto3);

		CarDTO dto4 = new CarDTO("Lamborighini", 30000000, CarVariant.TOP);

		carShowRoom.addCar(dto4);
		
		CarDTO dto5 = new CarDTO("Maruti 800", 30000, CarVariant.BASE);
		
		carShowRoom.addCar(dto5);
		
		CarDTO dto6 = new CarDTO("Ford Mustang", 7500000, CarVariant.TOP);
		
		carShowRoom.addCar(dto6);
		
		
		carShowRoom.displayCars();
		
		carShowRoom.updateCarVariant(CarVariant.BASE, 1);
		
		//carShowRoom.displayCars();
		
		carShowRoom.displayCarAtIndex(1);
		
		carShowRoom.displayCarByModel("Jeep");
		
		
		

	}

}
