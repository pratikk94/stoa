package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.demo.repository")
public class StoaAssignementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoaAssignementApplication.class, args);
	}

}
