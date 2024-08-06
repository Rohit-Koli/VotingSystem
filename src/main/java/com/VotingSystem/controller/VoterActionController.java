package com.VotingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.VotingSystem.entity.Voter;
import com.VotingSystem.services.VoterService;

@Controller
@RequestMapping("/")
public class VoterActionController {

    @Autowired
    private VoterService voterService;

    @GetMapping("admin/voterList")
    public String voterList(Model model) {
        model.addAttribute("voters", voterService.voterList());
        return "admin/voterList";
    }

    @GetMapping("deleteVoter")
    public String voterDelete(@RequestParam("id") int Id, Model model) {
        voterService.deleteVoter(Id);
        model.addAttribute("voters", voterService.voterList());
        return "admin/voterList";
    }
    
    @GetMapping("updateVoter")
    public String updateVoterForm(@RequestParam("id") int id, Model model) {
        Voter voter = voterService.findById(id);
        model.addAttribute("voter", voter);
        return "admin/updateVoter";
    }

    @PostMapping("updateVoter")
    public String updateVoter(@ModelAttribute("voter") Voter voter, Model model) {
        voterService.updateVoter(voter, voter.getId());
        model.addAttribute("voters", voterService.voterList());
        return "admin/voterList";
    }
    
    @GetMapping("voterUpdatePage")
    public String voterUpdatePageLoad() {
    	return "updateVoter";
    }
}
