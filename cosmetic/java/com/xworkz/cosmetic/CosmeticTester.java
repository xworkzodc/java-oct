package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.constants.Shade;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {

		// data --- dto
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setCosmeticType(CosmeticType.TONER);
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShade(Shade.RED);
		//CosmeticDAO dao = new CosmeticDAOImpl();
		//dao.save(cosmeticDTO);
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Mac", Shade.BLUE, CosmeticType.EYELINER, 30, 2);
//Maybelline
		// Lakme
		//dao.save(cosmeticDTO2);
		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Lakme", Shade.BLUE, CosmeticType.EYELINER, 20, 2);
		//dao.save(cosmeticDTO3);
		
		List<CosmeticDTO> cosmeticDTOs=new ArrayList<CosmeticDTO>();
		cosmeticDTOs.add(cosmeticDTO);
		cosmeticDTOs.add(cosmeticDTO2);
		cosmeticDTOs.add(cosmeticDTO3);
		
		for (CosmeticDTO cosmeticDTO4 : cosmeticDTOs) {
			System.out.println(cosmeticDTO4.getBrand());
		}
		
		Collections.sort(cosmeticDTOs);
		
		for (CosmeticDTO cosmeticDTO4 : cosmeticDTOs) {
			System.out.println(cosmeticDTO4.getBrand());
		}
	}

}
