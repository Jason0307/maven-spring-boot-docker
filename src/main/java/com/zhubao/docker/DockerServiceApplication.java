package com.zhubao.docker;

import java.util.ResourceBundle;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import com.zhubao.docker.datasource.DynamicDataSourceRegister;

@SpringBootApplication
@ServletComponentScan
@Import(DynamicDataSourceRegister.class)
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
