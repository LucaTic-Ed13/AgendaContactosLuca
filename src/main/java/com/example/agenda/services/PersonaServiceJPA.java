package com.example.agenda.services;

import java.util.List;
import com.example.agenda.dao.PersonaJPAImpl;
import com.example.agenda.model.Persona;

public class PersonaServiceJPA implements PersonaService {

	@Override
	public List<Persona> list() {
		PersonaJPAImpl.this
		return null;
	}

	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Persona actual) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Persona nuevo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int idPersona) {
		// TODO Auto-generated method stub
		return false;
	}

}
