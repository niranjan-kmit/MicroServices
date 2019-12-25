package com.demo.inpixon.candidate.model;

import java.util.ArrayList;
import java.util.List;
/**
 * DTO model for holding the both services data.
 * @author NIRANJAN
 *
 */
public class CandidateDTO {

	private List<Employer> employers = null;

	private List<Candidate> candidates = null;

	public CandidateDTO() {

		this.employers = new ArrayList<>();
		
		this.candidates = new ArrayList<>();

	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

}
