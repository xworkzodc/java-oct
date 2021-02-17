package com.xworkz.choice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.choice.dto.IPlTeamDTO;
import com.xworkz.choice.dto.IPlTeamDTO.JerserColor;

public class VishalakshiTester {

	public static void main(String[] args) {

		IPlTeamDTO iPlTeamDTO = new IPlTeamDTO("RCB", "Virat", JerserColor.RED,
				"Dr Mallya", "M Chinnaswamy Stadium", 5);

		IPlTeamDTO iPlTeamDTO1 = new IPlTeamDTO("CSK", "MS DHONI",
				JerserColor.YELLOW, "Kavya", "MA CHIDAMBARAM Stadium", 2);

		IPlTeamDTO iPlTeamDTO2 = new IPlTeamDTO("MI", "ROhit", JerserColor.BLUE,
				"Neeta Ambani", "Wakande", 3);

		IPlTeamDTO iPlTeamDTO3 = new IPlTeamDTO("SRH", "Warner",
				JerserColor.ORANGE, "Prathyusha", "Hyderbad", 2);

		List<IPlTeamDTO> list = new ArrayList<IPlTeamDTO>();
		list.add(iPlTeamDTO1);
		list.add(iPlTeamDTO3);
		list.add(iPlTeamDTO2);
		list.add(iPlTeamDTO);

		list.stream().filter(i -> i.getRating() > 2)
				.sorted((e1,e2)->Float.compare(e1.getRating(), e2.getRating()))
				.map(IPlTeamDTO::getName)
				.forEach(System.out::println);
/*		float totalRating=0;*/
		//List<IPlTeamDTO> lessList=list.stream().filter(r->r.getRating()<3)
/*		.collect(Collectors.toList());
		
		for (IPlTeamDTO e : lessList) {
			System.out.println(e.getName());
			totalRating=totalRating+e.getRating();
		}
		
		System.out.println(totalRating);
		*/		
		
		double totalRating=list.stream().filter(r->r.getRating()<3).
				mapToDouble(IPlTeamDTO::getRating).sum();
		System.out.println(totalRating);
	}

}




