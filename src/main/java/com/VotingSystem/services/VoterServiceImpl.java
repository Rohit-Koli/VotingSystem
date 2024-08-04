package com.VotingSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingSystem.entity.Voter;
import com.VotingSystem.repository.VoterRepository;

@Service
public class VoterServiceImpl implements VoterService {
	@Autowired
	private VoterRepository voterRepo;
	
	@Override
	public Voter saveVoter(Voter voter1) {
		return voterRepo.save(voter1);
	}

	@Override
	public List<Voter> voterList() {
		List<Voter> find=voterRepo.findAll();
		return find;
	}

	@Override
	public Voter findById(int id) {
		Optional<Voter> findById=voterRepo.findById(id);
		Voter voter=findById.get();
		return voter;
	}

	@Override
	public Voter updateVoter(Voter voter,int id) {
		Optional<Voter> voterData=voterRepo.findById(id);
		if(voterData.isPresent()) {
			Voter newVoter=voterData.get();
			newVoter.setUsername(voter.getUsername());
			newVoter.setDob(voter.getDob());
			newVoter.setGender(voter.getGender());
			newVoter.setPassword(voter.getPassword());
			newVoter.setUsername(voter.getUsername());
			voterRepo.save(newVoter);
		}
		return null;
	}

	@Override
	public void deleteVoter(int id) {
		Optional<Voter> findById=voterRepo.findById(id);
		Voter voter=findById.get();
		voterRepo.delete(voter);
	}
	
	@Override
	public Voter findByUsernameAndPassword(String username, String password) {
        return voterRepo.findByUsernameAndPassword(username, password);
    }

}
