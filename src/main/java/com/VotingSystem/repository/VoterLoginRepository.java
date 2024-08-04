package com.VotingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VotingSystem.entity.VoterLogin;

public interface VoterLoginRepository extends JpaRepository<VoterLogin, Integer>{
//	public int totalVoterLoginCount();
}
