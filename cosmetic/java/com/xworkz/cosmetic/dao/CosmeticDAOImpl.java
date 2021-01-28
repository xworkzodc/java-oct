package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmetics;

	public CosmeticDAOImpl(List<CosmeticDTO> list) {
		this.cosmetics = list;
		System.out.println("Created CosmeticDAOImpl");
	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);// Lakme
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetic added"+dto);
		else
			System.out.println("cosmetic not added");
		return added;
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
       
          Iterator<CosmeticDTO> iterator=this.cosmetics.iterator();
          while(iterator.hasNext())
          {
        	  CosmeticDTO dto=iterator.next();
        	  if(dto.getBrand().equals(brand))
        	  {
        		  iterator.remove();
        		  return true;
        	  }
          }
		return false;
	}

	@Override
	public void deleteAll() {
		
	}

	@Override
	public List<CosmeticDTO> getAll() {
		return this.cosmetics;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.cosmetics.size();
	}

}
