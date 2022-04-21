package com.DrugInventoryMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrugInventoryMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugInventoryMicroservicesApplication.class, args);
	}

}
