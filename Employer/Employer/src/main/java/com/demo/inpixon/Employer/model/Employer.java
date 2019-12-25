package com.demo.inpixon.Employer.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model for Employer
 * @author NIRANJAN
 *
 */
@Document(collection = "employer_table")
public class Employer implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String companyName;
	
	private String jobTitle;

	private String jobLocation;

	private int salary;

	public Employer() {
	}

	public Employer(String companyName,String jobTitle, String jobLocation, int salary) {
		super();
		this.companyName=companyName;
		this.jobTitle = jobTitle;
		this.jobLocation = jobLocation;
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
