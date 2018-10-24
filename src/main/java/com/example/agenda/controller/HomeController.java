package com.example.agenda.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.agenda.model.Contacto;
import com.example.agenda.model.Persona;
import com.example.agenda.services.PersonaService;

@RestController
public class HomeController {

	@Autowired
	private ContactoService contactoService;
	
	
	@GetMapping("/contactos")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public Collection<Contacto> contactos(){
		return contactoService
				.findAll()
				.stream()
				.collect(Collectors.toList());
	}
<<<<<<< HEAD
	
	
	/*@GetMapping("/contactos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public Contacto contactoPorId(@PathVariable int id){
		return contactoService
				.findById(id)
				.stream()
				.collect(Collectors.toList());
	}*/
=======
}
>>>>>>> c470c13c9853642b31c214aa95b63b6e40e1df85
