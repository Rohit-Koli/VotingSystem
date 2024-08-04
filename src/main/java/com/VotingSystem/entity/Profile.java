package com.VotingSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Profile {
	@Id
	private int id;
	@Lob
	@Column(name="profile",length=1000000)
	private byte[] img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public Profile(int id, byte[] img) {
		super();
		this.id = id;
		this.img = img;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
