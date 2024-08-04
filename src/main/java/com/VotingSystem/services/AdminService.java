package com.VotingSystem.services;

import java.util.List;

import com.VotingSystem.entity.Admin;

public interface AdminService {
	public void saveAdmin(Admin admin);

	public List<Admin> adminlist();

//	public Admin authenticate(String username, String password);
}
