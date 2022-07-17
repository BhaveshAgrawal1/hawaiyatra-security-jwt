package com.dev.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminDetails implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	@Id
	private String username;
	private String password;
	
	public AdminDetails()
	{
		
	}

	public AdminDetails(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
