package com.payload.read;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class User {

	private String firstname;
	
	private String lastname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
	
	
}
