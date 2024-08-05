package com.VotingSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VotingSystem.entity.Admin;
import com.VotingSystem.entity.AdminLogin;
import com.VotingSystem.repository.AdminLoginRepository;
import com.VotingSystem.repository.AdminRepository;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private AdminLoginRepository adminLoginRepo;

	@Override
	public AdminLogin login(String username, String password) {
		Admin adminLogin =adminRepo.findByUsernameAndPassword(username, password);
        if (adminLogin != null && adminLogin.getPassword().equals(password)) {
        	AdminLogin admin= new AdminLogin(username,password); 
            return adminLoginRepo.save(admin);
        }
        return null;
	}

	@Override
	public List<AdminLogin> adminList() {
		List<AdminLogin> adminLoginList=adminLoginRepo.findAll();
		if(adminLoginList!=null) {
			return adminLoginList;
		}
		return null;
	}

	@Override
	public boolean deleteAdminLogin(int id) {
		Optional<AdminLogin> res=adminLoginRepo.findById(id);
		if(res.isPresent()) {
			adminLoginRepo.deleteById(id);
			return true;
		}
		return false;
	}	
	
}
