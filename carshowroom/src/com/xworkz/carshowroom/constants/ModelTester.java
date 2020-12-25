package com.xworkz.carshowroom.constants;

import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class ModelTester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom("Hondai","hubli");
		CarDTO carDTO=new CarDTO("Volva", 8000000,CarVariant.TOP);
		carShowRoom.addCar(carDTO);
		carShowRoom.displayCars();
		carShowRoom.deleteByModel("Swift");
		
				
		

	}

}
