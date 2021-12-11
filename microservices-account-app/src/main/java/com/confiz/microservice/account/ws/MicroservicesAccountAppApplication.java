package com.confiz.microservice.account.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesAccountAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesAccountAppApplication.class, args);
	}

}
