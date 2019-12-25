package com.demo.inpixon.candidate;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.inpixon.candidate.model.Employer;

/**
 * FeinClient proxy service.
 * @author NIRANJAN
 *
 */
@FeignClient(name="ZuulProxyService")
public interface EmployerClient 
{
	@RequestMapping(value = "employers-api/employer", method = RequestMethod.GET, consumes = "application/json")
	public List<Employer> getAllEmployers();
	
}
