package com.demo.inpixon.candidate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.inpixon.candidate.model.Candidate;
import com.demo.inpixon.candidate.model.CandidateDTO;
import com.demo.inpixon.candidate.services.CandidateService;

/**
 * Controller for Candidate model.
 * @author NIRANJAN
 *
 */
@RestController
@RequestMapping("/candidate")
public class CandidateController {
	
	@Autowired
	private CandidateService candidateService;
	
	@PostMapping
	public void createCandidate(@RequestBody Candidate candidate){
		candidateService.cretaeCandidate(candidate);
	}
	
	@GetMapping(produces={"application/json"})
	public CandidateDTO getAllCandidates(){
		return candidateService.getAllCandidates();
	}
	
	

}
