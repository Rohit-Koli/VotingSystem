package com.VotingSystem.services;

import java.util.List;

import com.VotingSystem.entity.AdminLogin;

public interface AdminLoginService {
	public AdminLogin login(String username, String password);
	public List<AdminLogin> adminList();
	public boolean deleteAdminLogin(int id);
}
