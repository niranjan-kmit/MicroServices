package com.demo.inpixon.zuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * ZuulGateway for Microservices.
 * @author NIRANJAN
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulproxyApplication.class, args);
	}
	
}
