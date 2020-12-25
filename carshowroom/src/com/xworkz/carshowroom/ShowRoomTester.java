package com.xworkz.carshowroom;

import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class ShowRoomTester {
	
	
	public static void main(String[] args) {
		 
		
		CarShowRoom carShowRoom=new CarShowRoom();
		
		carShowRoom.addManager("ravi", 1);

		
		carShowRoom.displayManager();
		
		carShowRoom.removeManager();
		
		carShowRoom.displayManager();
		
		
		ManagerDTO dto=new ManagerDTO("Devendra", 89);
		
		carShowRoom.addManager(dto);
		
		
		
		
		carShowRoom.displayManager();
	}

}
