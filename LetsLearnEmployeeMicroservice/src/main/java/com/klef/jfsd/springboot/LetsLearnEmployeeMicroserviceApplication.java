package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.klef.jfsd.springboot"})
public class LetsLearnEmployeeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsLearnEmployeeMicroserviceApplication.class, args);
		System.out.println("Let's Learn Employee Microservice");
	}

}
