package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.tracing.TracingProperties.Sampling;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient

public class LoginApiApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(LoginApiApplication.class, args);
	}

}
