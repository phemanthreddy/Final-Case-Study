package com.DoctorMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DoctorMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorMicroservicesApplication.class, args);
	}

}
