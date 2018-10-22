package com.example.agenda.services;

import java.sql.SQLException;
import java.util.ArrayList;
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
		List <Contacto> contacto = new List<>();
		try {
			return gestor.list();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}

	}

	@Override
	public Contacto get(int id) {
		return gestor.get(id);
	}

	@Override
	public boolean update(Contacto actual) {
		return gestor.update(actual);
	}

	@Override
	public boolean add(Contacto nuevo) {
		gestor.insert(nuevo);
		return true;
	}

	@Override
	public boolean delete(int idPersona) {
		return true;
	}
}
