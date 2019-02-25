package com.learn.gatewayapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayappApplication.class, args);
	}

}

