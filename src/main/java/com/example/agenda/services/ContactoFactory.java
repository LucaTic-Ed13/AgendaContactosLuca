package com.example.agenda.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.agenda.dao.*;
import com.example.agenda.model.*;

public class ContactoFactory {
	
	public ArrayList<Contacto> agruparContactos(ArrayList<Persona> personas, ArrayList<Direccion> direcciones, ArrayList<Telefono> telefonos) {
		ArrayList<Contacto> agenda = new ArrayList<>();
		Contacto actual;
		for(int i = 0; i < personas.size(); i++) {
			actual = new Contacto();
			actual.setPersona(personas.get(i));
			for(Direccion dir:direcciones) {
				if(dir.getIdPersona() == personas.get(i).getIdPersona()) {
					actual.addDireccion(dir);
				}
			}
			for(Telefono tel:telefonos) {
				if(tel.getIdPersona() == personas.get(i).getIdPersona()) {
					actual.addTelefono(tel);
				}
			}
			agenda.add(actual);
		}
		return agenda;
	}
	
	// Este metodo debe ir en un servicio
	@SuppressWarnings("deprecation")
	public ArrayList<Contacto> brujeria() throws ClassNotFoundException, SQLException {
		PersonaDAOImpl gestorPersona = new PersonaDAOImpl();
		TelefonoDAOImpl gestorTelefono = new TelefonoDAOImpl();
		DireccionDAOImpl gestorDireccion = new DireccionDAOImpl();
		return agruparContactos((ArrayList<Persona>)gestorPersona.list(), (ArrayList<Direccion>)gestorDireccion.list(), (ArrayList<Telefono>)gestorTelefono.list());
	}

}
