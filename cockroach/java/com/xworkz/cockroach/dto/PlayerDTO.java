package com.xworkz.cockroach.dto;

public class PlayerDTO implements Cloneable {

	private String name;
	private int jerseyNumber;
	private String sport;

	public PlayerDTO() {
		// Instantiation---Initlization
		System.out.println("Created PlayerDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			if (this == obj) {
				return true;
			} else {
				if (obj instanceof PlayerDTO) {
					PlayerDTO dto = (PlayerDTO) obj;
					if (dto.getJerseyNumber() > 0 && dto.getJerseyNumber() == this.jerseyNumber) {
						return true;
					} else {
						return false;
					}
				}
			}
		return false;
	}

	@Override
	public String toString() {
		return "PlayerDTO [name=" + name + ", jerseyNumber=" + jerseyNumber + ", sport=" + sport + "]";
	}

	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public PlayerDTO clone() throws CloneNotSupportedException {
		PlayerDTO dto = new PlayerDTO();
		dto.name = this.name;
		dto.sport = this.sport;
		return dto;
	}

}
