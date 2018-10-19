package com.example.agenda.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.dao.ContactoDAO;
import com.ejemplos.spring.model.Contacto;

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
	public boolean update(Contacto actual) {
		gestor.update(actual);
		return true;
	}

	@Override
	public boolean add(Contacto nuevo) {
		gestor.add(nuevo));
		return true;
	}

	@Override
	public boolean delete(int id) {
		gestor.delete(id);
		return true;
	}

}
