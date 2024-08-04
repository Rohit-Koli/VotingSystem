package com.VotingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.VotingSystem.entity.VoterLogin;
import com.VotingSystem.services.VoterLoginService;

@Controller
public class VoterLoginController {
	@Autowired
	private VoterLoginService voterLoginService;
	@GetMapping("/voter/voterLogin")
	public String voterLogin(Model model) {
		model.addAttribute("voterLogin",new VoterLogin());
		return "voter/voterLogin";
	}
	@PostMapping("/voter/goVoterLogin")
	public String voterLoginReg(@RequestParam("username") String Username,
								@RequestParam("password") String Password,
								Model model) {
		VoterLogin vLogin= voterLoginService.saveVoterLogin(Username,Password);
		if(vLogin!=null) {
			model.addAttribute("voterLogin",vLogin);
			return "voter/voterHomePage";
		}else {
			model.addAttribute("error", "Invalid username or password");
            return "voter/voterLogin";
		}
		
	}
}
