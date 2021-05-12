package starbucksDemo.entities;

import starbucksDemo.abstracts.Entity;

public class Customer implements Entity{
	public int id;
	public int dateBirth;
	public String firstName;
	public String lastName;
	public String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, int dateBirth, String firstName, String lastName, String nationalityId) {
		
		this.id = id;
		this.dateBirth = dateBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(int dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	 
}
