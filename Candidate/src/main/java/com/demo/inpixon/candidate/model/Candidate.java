package com.demo.inpixon.candidate.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model Class for Candidate.
 * @author NIRANJAN
 *
 */
@Document(collection = "candidate_table")
public class Candidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String candidateName;

	private String location;

	private int salary;

	public Candidate() {
	}

	public Candidate(String candidateName, String location, int salary) {
		super();
		this.candidateName = candidateName;
		this.location = location;
		this.salary = salary;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
