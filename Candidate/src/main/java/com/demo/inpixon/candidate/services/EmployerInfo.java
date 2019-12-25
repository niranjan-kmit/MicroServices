package com.demo.inpixon.candidate.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.inpixon.candidate.EmployerClient;
import com.demo.inpixon.candidate.model.Employer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * Employer Info service to handle the fallback method.
 * @author NIRANJAN
 *
 */
@Service
public class EmployerInfo {
	
	@Autowired
	private EmployerClient employerClient;
	
	@HystrixCommand(fallbackMethod ="getFallbackResponse",commandProperties = {
		       @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"),
		       @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60")
		    })
	public List<Employer> getAllEmployers(){
		return employerClient.getAllEmployers();
	}
	
	public List<Employer> getFallbackResponse() {
		List<Employer> employers=new ArrayList<>();
		employers.add(new Employer("Dummy CompanyName","DummyCompany Title","DummyLocation",0000));
		return employers;
		
	}

}
