package com.VotingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.VotingSystem.entity.Voter;
import com.VotingSystem.services.VoterService;

import jakarta.validation.Valid;

@Controller
public class VoterController {
	@Autowired
	private VoterService voterService;
	
	@GetMapping("/voter/voterRegister")
	public String voterRegister(Model model) {
		model.addAttribute("voter", new Voter());
		return "/voter/voterRegister";
	}
	@PostMapping("/voter/addVoter")
	public String voterAdd(@Valid @ModelAttribute Voter voter,BindingResult bindRes) {
		if(bindRes.hasErrors()) {	
			return "/voter/voterRegister";
		}else {
			voterService.saveVoter(voter);
			return "/voter/voterLogin";
		}
		
	}
}
