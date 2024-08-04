package com.VotingSystem.services;

import com.VotingSystem.entity.VoterLogin;

public interface VoterLoginService {
	public VoterLogin saveVoterLogin(String username, String password);
	public long totalVoterLoginCount();
	public void deleteVoterLogin(int id);
}
