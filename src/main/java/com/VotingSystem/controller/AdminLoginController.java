package com.VotingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.VotingSystem.entity.AdminLogin;
import com.VotingSystem.services.AdminLoginService;

@Controller
public class AdminLoginController {
	@Autowired
	private AdminLoginService adminLoginService;
	
	@GetMapping("/admin/login")
    public String showLoginForm() {
        return "admin/adminLogin";
    }

    @PostMapping("/admin/login")
    public String login(@RequestParam("username") String Username,
                        @RequestParam("password") String Password,
                        Model model) {
        AdminLogin adminLogin = adminLoginService.login(Username, Password);
        if (adminLogin != null) {
            model.addAttribute("loginAdmin", adminLogin);
            return "admin/adminDashboard"; // redirect to a dashboard or home page
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "admin/adminLogin";
        }
    }
}
