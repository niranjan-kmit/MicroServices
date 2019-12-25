package com.demo.inpixon.Employer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.inpixon.Employer.model.Employer;

/**
 * Repository Interface.
 * @author NIRANJAN
 *
 */
public interface EmployeRepository extends MongoRepository<Employer, String> {

}
