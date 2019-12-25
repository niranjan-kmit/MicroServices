package com.demo.inpixon.candidate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inpixon.candidate.model.Candidate;
import com.demo.inpixon.candidate.model.CandidateDTO;
import com.demo.inpixon.candidate.model.Employer;
import com.demo.inpixon.candidate.repository.CandidateRepository;

/**
 * Candidate Service for processing the business logic.
 * @author NIRANJAN
 *
 */
@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	@Autowired
	private EmployerInfo employerInfo;

	public void cretaeCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
	}

	public CandidateDTO getAllCandidates() {
		List<Employer> employers = employerInfo.getAllEmployers();
		CandidateDTO data = new CandidateDTO();
		data.setEmployers(employers);
		data.setCandidates(candidateRepository.findAll());
		return data;
	}
	
	

}
