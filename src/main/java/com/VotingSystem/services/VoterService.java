package com.VotingSystem.services;

import java.util.List;

import com.VotingSystem.entity.Voter;

public interface VoterService {
	public Voter saveVoter(Voter voter);
	public List<Voter> voterList();
	public Voter findById(int id);
	public Voter updateVoter(Voter voter,int id);
	public void deleteVoter(int id);
	public Voter findByUsernameAndPassword(String username, String password);
}
