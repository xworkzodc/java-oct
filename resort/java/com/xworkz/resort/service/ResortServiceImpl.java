package com.xworkz.resort.service;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO dao;

	public ResortServiceImpl(ResortDAO dao) {
		this.dao = dao;
	}

	@Override
	public void validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");
		System.out.println("arg1 " + dto);
		boolean valid = false;
		if (dto != null) {
			String tempName = dto.getName();
			if (tempName != null && !tempName.isEmpty() && !tempName.contains(" ")) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.out.println("name is not valid");
				valid = false;
			}
			if (valid) {
				System.out.println("dto is valid, can save");
				// ResortDAO dao=new ResortDAOImpl(new ArrayList<ResortDTO>());
				dao.save(dto);
			} else {
				System.out.println("dto is invalid , cannot save");
			}

		} else {
			System.out.println("dto is null");
		}

	}

}
