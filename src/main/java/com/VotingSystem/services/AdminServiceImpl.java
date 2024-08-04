package com.VotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingSystem.entity.Admin;
import com.VotingSystem.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepository adminRepo;
	
	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminRepo.save(admin);
	}
	
	@Override
	public List<Admin> adminlist(){
		List<Admin> find=adminRepo.findAll();		
		return find;
	}
	
	/*

	@Override
	public Admin authenticate(String username, String password) {
		Admin admin = adminRepo.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return admin;
        }
        return null;
	}
	
	*/
}
