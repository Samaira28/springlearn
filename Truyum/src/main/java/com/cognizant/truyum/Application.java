package com.cognizant.truyum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		final Logger LOGGER = LoggerFactory.getLogger(Application.class);

		SpringApplication.run(Application.class, args);
		LOGGER.debug("Started...!");
		
	}

}
