package com.example.agenda.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.agenda.model.Contacto;
import com.example.agenda.services.ContactoService;

@RestController
public class HomeController {

	@Autowired
	private ContactoService contactoService;
	
	
	@GetMapping("/contactos")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public Collection<Contacto> contactos(){
		return contactoService
				.findAll();
	}

	
	
	/*@GetMapping("/contactos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public Contacto contactoPorId(@PathVariable  int id){
		return contactoService
				.findById(id)
				.stream()
				.collect(Collectors.toList());
	}*/

}

