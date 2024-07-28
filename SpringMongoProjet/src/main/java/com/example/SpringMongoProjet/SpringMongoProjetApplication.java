package com.example.SpringMongoProjet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.example") //to scan packages mentioned
@EnableMongoRepositories("com.example") //to activate MongoDB repositories
public class SpringMongoProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoProjetApplication.class, args);
	}

}
