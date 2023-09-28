package com.sagatrading.reportingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ReportingServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReportingServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Reporting/Logging Service";
	}

}





