package com.demo.inpixon.Employer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inpixon.Employer.model.Employer;
import com.demo.inpixon.Employer.repository.EmployeRepository;

/**
 * Service for Employer to process business logic.
 * @author NIRANJAN
 *
 */
@Service
public class EmployerService {
	
	@Autowired
	private EmployeRepository employeRepository;
	
	public void cretaeEmployer(Employer employer){
		employeRepository.save(employer);
	}
	
	public List<Employer> getEmployers(){
		return employeRepository.findAll();
	}

}
