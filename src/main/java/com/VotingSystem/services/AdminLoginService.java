package com.VotingSystem.services;

import com.VotingSystem.entity.AdminLogin;

public interface AdminLoginService {
	public AdminLogin login(String username, String password);
}
