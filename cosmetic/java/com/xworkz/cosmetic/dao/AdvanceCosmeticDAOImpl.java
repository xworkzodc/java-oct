package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class AdvanceCosmeticDAOImpl implements CosmeticDAO{

	@Override
	public boolean save(CosmeticDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTypeByBrand(String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CosmeticDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
