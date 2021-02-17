package com.xworkz.choice.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class IPlTeamDTO {

	private String name;
	private String captainName;
	private JerserColor jerseyColor;
	private String ownerName;
	private String homeGround;
	private float rating;

	public enum JerserColor {
		RED, BLUE, YELLOW,ORANGE
	}

}
