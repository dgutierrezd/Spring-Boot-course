package com.curso.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.curso"})
@EnableJpaRepositories("com.curso.respository")
@EntityScan(basePackages = "com.curso.entities")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
