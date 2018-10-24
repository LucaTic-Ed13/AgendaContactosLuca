package com.example.agenda.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.ContactoJPA;
import com.example.agenda.dao.PersonaDAO;
import com.example.agenda.model.Contacto;
import com.example.agenda.model.Persona;


@Service
@Transactional
public abstract class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoJPA repository;

	@Override
	public List<Contacto > findAll() {
		
		return repository.findAll();
	
	}

	@Override
	public Contacto getOne(int id) {
	
		return repository.getOne(id);
		
	}

	@Override
	@Transactional
	public Contacto save(Contacto contacto) {
		return repository.save(contacto);
	}

	

	@Override
	@Transactional
	public void delete(int idContacto) {
		repository.deleteById(idContacto);
	}
}
