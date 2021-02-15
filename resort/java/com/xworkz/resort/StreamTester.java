package com.xworkz.resort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.resort.dto.AlcoholDTO;
import com.xworkz.resort.dto.AlcoholDTO.AlcoholType;

public class StreamTester {

	public static void main(String[] args) {

		List<AlcoholDTO> alcoholDTOs = new ArrayList<>();

		alcoholDTOs.add(new AlcoholDTO("UB", AlcoholType.BEER, 100));
		alcoholDTOs.add(new AlcoholDTO("KB", AlcoholType.BEER, 200));
		alcoholDTOs.add(new AlcoholDTO("KB", AlcoholType.RUM, 300));
		alcoholDTOs.add(new AlcoholDTO("SB", AlcoholType.WINE, 100));
		alcoholDTOs.add(new AlcoholDTO("UB", AlcoholType.BEER, 100));

		for (AlcoholDTO alcoholDTO : alcoholDTOs) {
			if (alcoholDTO.getType().equals(AlcoholType.BEER))
			{
				
			}
		}

		Collections.sort(alcoholDTOs, (a, b) ->
		Double.valueOf(b.getPrice()).compareTo(Double.valueOf(a.getPrice())));

		
		
		
		
	}
}
