package com.demo.inpixon.Employer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.inpixon.Employer.model.Employer;
import com.demo.inpixon.Employer.services.EmployerService;

/**
 * Controller for Employer Model.
 * @author NIRANJAN
 *
 */
@RestController
@RequestMapping("/employer")
public class EmployeController {
	
	@Autowired
	private EmployerService empService;
	
	@PostMapping
	public void createEmploye(@RequestBody Employer employer){
		empService.cretaeEmployer(employer);
	}
	
	@GetMapping(produces={"application/json"})
	public List<Employer> getAllEmployers(){
		return empService.getEmployers();
	}
	
	

}
