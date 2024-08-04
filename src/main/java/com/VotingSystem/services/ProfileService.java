package com.VotingSystem.services;

import com.VotingSystem.entity.Profile;

public interface ProfileService {
	public Profile setProfile(Profile profile);

	public Profile getById(int id);

	public boolean existById(int id);
}
