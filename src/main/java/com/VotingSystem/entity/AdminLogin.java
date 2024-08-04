package com.VotingSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class AdminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Required")
	private String username;
	
	@NotBlank(message = "Required")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdminLogin(int id, @NotBlank(message = "Required") String username,
			@NotBlank(message = "Required") String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminLogin(@NotBlank(message = "Required") String username,
			@NotBlank(message = "Required") String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
