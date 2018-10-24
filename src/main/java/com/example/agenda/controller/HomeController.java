package com.example.agenda.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.agenda.model.Persona;
import com.example.agenda.services.PersonaService;

@SuppressWarnings("unused")
@Controller
public class HomeController {

	@Autowired
	private PersonaService personaService;
	
	
	
	
	@RequestMapping("/agenda")
	public ModelAndView handleRequest() throws Exception {
		List<Persona > listPersonas = personaService.list();
		ModelAndView model = new ModelAndView("PersonasList");
		model.addObject("personaList", listPersonas);
		return model;
		
	}
	
/*
	@GetMapping("/")
	public String home() {
		return "home";
	}*/
}
