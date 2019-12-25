package com.demo.inpixon.Employer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories("com.demo.inpixon.Employer.repository")
public class EmployerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployerApplication.class, args);
	}

}