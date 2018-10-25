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
	private PersonaServiceImpl personaService;
	private ContactoFactory contactoService;
	
	@GetMapping("/contactos")
	@CrossOrigin(origins = "http://localhost:4200")
	
    public Collection<Contacto> ListadoContactos() {
        return contactoService.getAllContactos();
	}
	
	@GetMapping("/agenda")
	@CrossOrigin(origins = "http://localhost:4200")
	
    public Collection<Persona> ListadoPersonas() {
        return personaService.getAllPersonas();
	}
}
	
