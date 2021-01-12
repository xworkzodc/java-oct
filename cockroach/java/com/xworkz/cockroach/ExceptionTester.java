package com.xworkz.cockroach;

import com.xworkz.cockroach.dto.PlayerDTO;
import com.xworkz.cockroach.event.PlayerService;

public class ExceptionTester {

	public static void main(String[] args) {

		PlayerService playerService = new PlayerService();

		PlayerDTO dto=new PlayerDTO();;
		
		playerService.showDetails(dto);
	}

}
