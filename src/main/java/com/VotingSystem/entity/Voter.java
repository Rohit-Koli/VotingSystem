package com.VotingSystem.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Voter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Name cannot be blank")
	@Pattern(regexp = "^[a-zA-Z+$]",message = "Only characters are Allowed")
	@Size(min = 4,max = 10,message = "Name should contain 4 to 10 characters only")
	private String voterName;
	private Date dob;
	private String gender;
	private String address;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voter(int id,
			@NotBlank(message = "Name cannot be blank") @Pattern(regexp = "^[a-zA-Z+$]", message = "Only characters are Allowed") @Size(min = 4, max = 10, message = "Name should contain 4 to 10 characters only") String voterName,
			Date dob, String gender,String  address, String username, String password) {
		super();
		this.id = id;
		this.voterName = voterName;
		this.dob = dob;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.address= address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
