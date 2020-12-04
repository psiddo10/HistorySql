package com.example.webdemo.resttemplatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ResttemplatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResttemplatedemoApplication.class, args);
	}
	
}
