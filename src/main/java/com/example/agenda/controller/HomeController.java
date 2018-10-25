package com.example.agenda.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
	@Autowired	
	private DireccionService direccion;
	@Autowired	
	private TelefonoService telefono;
	@Autowired	
	private ProvinciaService provincia;
	@Autowired
	private ContactoFactory contactoService;
	
	@GetMapping("/contactos")
	@CrossOrigin(origins = "http://localhost:4200")
	
    public Collection<Contacto> ListadoContactos() {
		Collection<Contacto> salida = getAllContactos();
        return salida;
	}
	
	@GetMapping("/agenda")
	@CrossOrigin(origins = "http://localhost:4200")
	
    public Collection<Persona> ListadoPersonas() {
        return personaService.getAllPersonas();
	}
	
	public List<Contacto> getAllContactos() {
		
		System.out.println("---getAllContactos: getAllPersonas");
		ArrayList<Persona> humanidad = (ArrayList<Persona>) personaService.getAllPersonas();
		System.out.println("---getAllContactos: getAllDirecciones");
		ArrayList<Direccion> calles = (ArrayList<Direccion>) direccion.getAllDirecciones();
		System.out.println("---getAllContactos: getAllTelefonos");
		ArrayList<Telefono> celulares = (ArrayList<Telefono>) telefono.getAllTelefonos();
		ArrayList<Provincia> ejpania = (ArrayList<Provincia>) provincia.getAllProvincias();
		System.out.println("Salgo de mostrar");
		return contactoService.coleccionContactos(humanidad, celulares, calles, ejpania);
	}
}
	
