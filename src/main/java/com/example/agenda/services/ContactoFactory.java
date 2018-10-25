package com.example.agenda.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.model.*;

@Service
public class ContactoFactory {
	
	@Autowired
	PersonaServiceImpl persona = new PersonaServiceImpl();
	DireccionServiceImpl direccion = new DireccionServiceImpl();
	TelefonoServiceImpl telefono = new TelefonoServiceImpl();
	ProvinciaServiceImpl provincia = new ProvinciaServiceImpl();
	
	public List<Contacto> getAllContactos() {
		
		System.out.println("Entro en mostrar");
		ArrayList<Persona> humanidad = (ArrayList<Persona>) persona.getAllPersonas();
		ArrayList<Direccion> calles = (ArrayList<Direccion>) direccion.getAllDirecciones();
		ArrayList<Telefono> celulares = (ArrayList<Telefono>) telefono.getAllTelefonos();
		ArrayList<Provincia> ejpania = (ArrayList<Provincia>) provincia.getAllProvincias();
		System.out.println("Salgo de mostrar");
		return coleccionContactos(humanidad, celulares, calles, ejpania);
	}

	private List<Contacto> coleccionContactos(ArrayList<Persona> personas, ArrayList<Telefono> telefonos, ArrayList<Direccion> direcciones, ArrayList<Provincia> provincias) {
		System.out.println("Entro en coleccion");
		ArrayList<Contacto> agenda = new ArrayList<>();
		Contacto actual;
		for(int i = 0; i < personas.size(); i++) {
			actual = new Contacto();
			actual.setPersona(personas.get(i));
			for(Direccion dir:direcciones) {
				if(dir.getIdPersona() == personas.get(i).getIdPersona()) {
					String provNombre = null;
					for (Provincia prov:provincias) {
						if(dir.getIdProvincia() == prov.getIdProvincia()) {
							provNombre = prov.getNombre();
						}
					}
					actual.addDireccion(dir.getDireccion(), dir.getCodPostal(), dir.getLocalidad(), provNombre);
				}
			}
			for(Telefono tel:telefonos) {
				if(tel.getIdPersona() == personas.get(i).getIdPersona()) {
					actual.addTelefono(tel.getTelefono());
				}
			}
			agenda.add(actual);
		}
		System.out.println(agenda.toString());
		System.out.println("Salgo de coleccion");
		return agenda;
	}

}
