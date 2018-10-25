package com.example.agenda.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.PersonaDAOJPA;
import com.example.agenda.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaDAOJPA repository;

	@Override
	public Persona getPersonaById(int id) {
    	return repository.getOne(id);
	}

	@Override
	public void savePersona(Persona persona) {
		repository.save(persona);
	}

	@Override
	public void updatePersona(Persona persona) {
		repository.save(persona);
	}

	@Override
	public void deletePersona(int id) {
		repository.deleteById(id);
	}

	@Transactional
	@Override
	public List<Persona> getAllPersonas() {
		return repository.findAll();
	}

}
