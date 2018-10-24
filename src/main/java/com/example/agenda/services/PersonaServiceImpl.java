package com.example.agenda.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.PersonaDAO;
import com.example.agenda.model.Persona;



@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDAO gestor;

	@Override
	public List<Persona > list() {
		try {
			return gestor.list();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@Override
	public Persona get(int id) {
		try {
			return gestor.get(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Persona();
		}
	}

	@Override
	public boolean update(Persona actual) {
		return gestor.update(actual);
	}

	@Override
	public boolean add(Persona  nuevo) {
		gestor.insert(nuevo);
		return true;
	}

	@Override
	public boolean delete(int idPersona) {
		return true;
	}
}
