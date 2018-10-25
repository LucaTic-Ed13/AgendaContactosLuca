package com.example.agenda.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.agenda.model.*;
import com.example.agenda.services.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class HomeController {

	@Autowired
	private PersonaService personaService;
	private DireccionService direccionService;
	
	@GetMapping("/agenda")
	@CrossOrigin(origins = "http://localhost:4200")
	
    public Collection<Persona> ListadoCompleto() {
        return personaService.getAllPersonas();
	}
}
	
