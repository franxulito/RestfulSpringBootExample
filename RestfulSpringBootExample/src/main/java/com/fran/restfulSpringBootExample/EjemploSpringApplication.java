package com.fran.restfulSpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fran
 * Para poder ejecutarlo, run as -> Spring Boot App
 * url get base: http://localhost:8281/api/games
 *
 */

@SpringBootApplication
public class EjemploSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploSpringApplication.class, args);
	}
}
