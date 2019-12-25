package com.demo.inpixon.candidate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.inpixon.candidate.model.Candidate;

/**
 * Repository Interface.
 * @author NIRANJAN
 */
@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {

}
