package com.xworkz.resort.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	private List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		System.out.println("Created ResortDAOImpl");
		this.resortList = resortDTOs;
	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("invoked save in dao");
		boolean added = this.resortList.add(dto);
		System.out.println("added " + added);
		return added;
	}

}
