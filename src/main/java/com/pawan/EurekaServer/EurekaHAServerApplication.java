package com.pawan.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaHAServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaHAServerApplication.class, args);
	}

}
