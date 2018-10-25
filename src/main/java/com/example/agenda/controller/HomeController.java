package com.example.agenda.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.agenda.model.*;
import com.example.agenda.services.*;


@RestController
public class HomeController {

	@Autowired
	private ContactoFactory personaService;
	
	@GetMapping("/agenda")
	@CrossOrigin(origins = "http://localhost:4200")
	
    public Collection<Contacto> ListadoPersonas() {
        return personaService.mostrarContactos();
	}
}
	
/*
	@GetMapping("/")
	public String home() {
		return "home";
	}*/

