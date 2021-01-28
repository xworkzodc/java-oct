package com.xworkz.cosmetic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.constants.Shade;
import com.xworkz.cosmetic.dao.AdvanceCosmeticDAOImpl;
import com.xworkz.cosmetic.dao.CosmeticDAO;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.dto.CosmeticDTO;
import com.xworkz.cosmetic.service.CosmeticService;
import com.xworkz.cosmetic.service.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {

		//CosmeticDAO dao=new CosmeticDAOImpl();
		
		CosmeticDTO cosmeticDTO=new CosmeticDTO();
		cosmeticDTO.setCosmeticType(CosmeticType.CONSEALER);
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setShade(Shade.BLACK);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setBrand("MAC");
		//dao.save(null);
		
		List<CosmeticDTO> list=new LinkedList<CosmeticDTO>();
		
		CosmeticDAO dao=new CosmeticDAOImpl(list);
		// Loose Coupling vs Tight Coupling
		//String com="Xworkz";
		CosmeticService service=new CosmeticServiceImpl(dao);
		
		service.validateAndSave(cosmeticDTO);
		
		
		CosmeticDTO cosmeticDTO2=new CosmeticDTO("Sugr", Shade.RED, CosmeticType.PRIMER, 1000, 2);
		
		service.validateAndSave(cosmeticDTO2);
		System.out.println(service.cosmeticsSize());

		service.deleteByBrand("Sugr");
		
		System.out.println(service.cosmeticsSize());
		
	}

}
