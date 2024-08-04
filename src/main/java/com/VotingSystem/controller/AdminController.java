package com.VotingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.VotingSystem.entity.Admin;
import com.VotingSystem.repository.AdminRepository;
import com.VotingSystem.services.AdminService;

import jakarta.validation.Valid;

@Controller
public class AdminController {
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/admin/saveAdmin")
	public String saveAdmin(Model model) {
		model.addAttribute("admin", new Admin());
		return "/admin/adminRegister";
	}
	
	@PostMapping("/admin/goadminRegister")
	public String getAdminStatus(@Valid @ModelAttribute Admin admin,BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return "/admin/adminRegister";
		}else {
			adminService.saveAdmin(admin);
			return "admin/adminLogin";
		}		
	}
	
	/*
	
	@PostMapping("adminAuth")
    public String adminAuthentication(@ModelAttribute Admin admin, Model model) {
        Admin authenticatedAdmin = adminService.authenticate(admin.getUsername(), admin.getPassword());
        if (authenticatedAdmin != null) {
            model.addAttribute("admin", authenticatedAdmin);
            return "adminDashboard";  // Change to your dashboard or home page
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "adminLogin";
        }
    }
    
    
    */
	
	@GetMapping("/admin/adminLoginPage")
	public String adminLoginPageMethod() {
		return "/admin/adminLogin";
	}
	
}
