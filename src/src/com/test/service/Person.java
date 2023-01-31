package com.test.service;

public class Person {
	
	private String[] personState;
	
	public Person() {
		personState =new String[] {"newlec","newlec","newlec","newlec"};
	}
	
	public String getPersonState(int j) {
		return personState[j];
	}

	public void setPersonState(String[] personState) {
		this.personState = personState;
	}

	
	
}
