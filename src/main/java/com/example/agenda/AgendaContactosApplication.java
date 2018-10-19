package com.example.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AgendaContactosApplication {
	

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AgendaContactosApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaContactosApplication.class, args);
	}
}
