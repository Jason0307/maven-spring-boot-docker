package com.zhubao.docker;

import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker 
@EnableHystrixDashboard
public class DockerServiceApplication {

	@PostConstruct
	public void initParams() {
		String username = ResourceBundle.getBundle("config").getString("username");
		System.out.println("Start to init params!" + username);
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerServiceApplication.class, args);
	}
}
