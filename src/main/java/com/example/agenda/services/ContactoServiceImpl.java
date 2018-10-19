package com.example.agenda.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.ContactoDAO;
import com.example.agenda.model.Contacto;

@Service
@Transactional
public class ContactoServiceImpl implements ContactoService {
	
	@Autowired
	private ContactoDAO gestor;
	
	@Override
	public List<Contacto> list() {
		return gestor.list();
	}

	@Override
	public Contacto get(int id) {
		return gestor.get(id);
	}

	@Override
	public void update(Contacto actual) {
		gestor.update(actual);
	}

	@Override
	public void add(Contacto nuevo) {
		gestor.add(nuevo);
	}

	@Override
	public void delete(int idPersona) {
		gestor.delete(idPersona);
	}
}
