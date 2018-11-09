package com.CoffeeShop.CoffeeShop;


import org.springframework.stereotype.Component;

@Component

public class Person {
	private String firstname;
	private String lastname;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstname = firstName;
		this.lastname = lastName;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstname + ", lastName=" + lastname + "]";
	}
	
	

}
