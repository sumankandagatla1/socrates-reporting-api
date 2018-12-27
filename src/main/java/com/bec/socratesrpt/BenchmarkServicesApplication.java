package com.bec.socratesrpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BenchmarkServicesApplication {

	public static void main(String[] args) {
		//Docker branch implementation
		SpringApplication.run(BenchmarkServicesApplication.class, args);
	}
}
