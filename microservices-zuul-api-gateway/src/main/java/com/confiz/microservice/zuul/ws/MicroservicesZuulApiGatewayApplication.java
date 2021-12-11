package com.confiz.microservice.zuul.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MicroservicesZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesZuulApiGatewayApplication.class, args);
	}
	
}
