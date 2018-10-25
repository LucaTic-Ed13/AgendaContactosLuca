package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.*;

@Repository
public class PersonaDAOImpl {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	public PersonaDAOImpl() {}

	
	@SuppressWarnings("unchecked")
	
	@Transactional
	public List<Persona > list() throws ClassNotFoundException, SQLException {
		return (List<Persona>) entityManager.createQuery("FROM Persona ORDER BY idpersona").getResultList();
	}

	
	@Transactional
	public Persona get(int id) throws ClassNotFoundException, SQLException{
		return (Persona) entityManager.find(Persona.class, id);
	}

	
	public boolean update(Persona  contacto) throws ClassNotFoundException, SQLException {
		Persona usuario = get(contacto.getIdPersona());

		usuario.setNombre(contacto.getNombre());
		usuario.setApellido1(contacto.getApellido1());
		usuario.setApellido2(contacto.getApellido2());
		usuario.setDni(contacto.getDni());
		usuario.setFechaNacimiento(contacto.getFechaNacimiento());
		entityManager.flush();
		return true;
	}

	
	public boolean insert(Persona  contacto) throws ClassNotFoundException, SQLException{
		entityManager.merge(contacto);
		return true;
	}

	
	@Transactional
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		entityManager.remove(get(id));
		return true;
	}

}