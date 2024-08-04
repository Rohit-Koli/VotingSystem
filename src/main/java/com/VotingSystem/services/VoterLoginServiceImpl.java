package com.VotingSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingSystem.entity.Voter;
import com.VotingSystem.entity.VoterLogin;
import com.VotingSystem.repository.VoterLoginRepository;
import com.VotingSystem.repository.VoterRepository;

@Service
public class VoterLoginServiceImpl implements VoterLoginService {
	@Autowired
	private VoterLoginRepository voterLoginRepo;
	@Autowired
	private VoterRepository voterRepo;
	
	@Override
	public long totalVoterLoginCount() {
		// TODO Auto-generated method stub
		return voterLoginRepo.count();
	}

	@Override
	public void deleteVoterLogin(int id) {
		voterLoginRepo.deleteById(id);
	}

	@Override
	public VoterLogin saveVoterLogin(String username, String password) {
		// TODO Auto-generated method stub
		Voter v=  voterRepo.findByUsernameAndPassword(username, password);
		if(v!=null) {
			VoterLogin voterLogin = new VoterLogin(username,password);
			return voterLoginRepo.save(voterLogin);
		}else {
			return null;
		}		
	}
}
