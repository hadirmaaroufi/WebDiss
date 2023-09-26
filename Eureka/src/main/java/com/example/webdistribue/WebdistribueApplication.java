package com.example.webdistribue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WebdistribueApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdistribueApplication.class, args);
	}

}
