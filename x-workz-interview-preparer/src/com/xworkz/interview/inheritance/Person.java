package com.xworkz.interview.inheritance;

public class Person {

	private String email;
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person) || obj == null) {
			System.out.println("not equal");
			return false;
		}
		Person person = (Person) obj;
		if (person.getName().equals(this.name) && person.getEmail().equals(this.email)
				&& person.hashCode() == this.hashCode()) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

}
