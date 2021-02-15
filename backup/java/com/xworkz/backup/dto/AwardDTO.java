package com.xworkz.backup.dto;

import java.io.Serializable;

public class AwardDTO implements Serializable {
//The serializable class AwardDTO does not declare a static final serialVersionUID field of type long
	private String name;
	private String type;
	private String winnerName;
	private String reasonForAward;

	
	@Override
	public String toString() {
		return "AwardDTO [name=" + name + ", type=" + type + ", winnerName=" + winnerName + ", reasonForAward="
				+ reasonForAward + "]";
	}

	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 15;
		}
	//[] vs Arrays
	
	@Override
	public boolean equals(Object arg0) {
		
		System.out.println("invoked equals");
		if (arg0 == null)
			return false;
		if (arg0 instanceof AwardDTO) {
			System.out.println("Argument is AWARDDTO");
			AwardDTO casted=(AwardDTO)arg0;//access dto properties
			if(this.name!=null && this.name.equals(casted.getName()) &&
					this.winnerName!=null &&
					this.winnerName.equals(casted.getWinnerName()))
			{
				return true;
			}
			
		} else {
			System.out.println("arg0 is not an award");
			throw new IllegalArgumentException("It must be AwardDTO");
			// return false;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWinnerName() {
		return winnerName;
	}

	public void setWinnerName(String winnerName) {
		this.winnerName = winnerName;
	}

	public String getReasonForAward() {
		return reasonForAward;
	}

	public void setReasonForAward(String reasonForAward) {
		this.reasonForAward = reasonForAward;
	}

}
