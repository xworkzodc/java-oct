package com.xworkz.choice.dao;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;

public class GiftDAOImpl implements GiftDAO {

	private List<GiftDTO> list;

	public GiftDAOImpl() {
		this.list = new ArrayList<GiftDTO>();
	}

	@Override
	public void save(GiftDTO dto) {
		System.out.println("invoked save" + dto);
		this.list.add(dto);
		// jdbc
	}

	@Override
	public Optional<GiftDTO> fetchByGivenBy(String name) {
// Rohan,Pasha,Skanda
		final Optional<GiftDTO> op=null;
		for (GiftDTO e : list) {
			Optional<String> givenby = e.getGivenBy();
			return givenby.filter(p->p.equals(name)).flatMap(ee->Optional.of(e));
			
		}
		return Optional.empty();
	}

}
