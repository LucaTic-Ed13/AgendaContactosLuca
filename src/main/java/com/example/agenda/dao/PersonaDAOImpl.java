package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.*;

@Repository
public class PersonaDAOImpl implements PersonaDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	public PersonaDAOImpl() {}

	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Persona > list() throws ClassNotFoundException, SQLException {
		//entityManager.createQuery("").getRes
		return (List<Persona >) entityManager.createQuery("FROM Persona ORDER BY idpersona").getResultList();
	}

	@Override
	public Persona  get(int id) {
		// TODO Auto-generated method stubsa
		return null;
	}

	@Override
	public boolean update(Persona  contacto) {
		// TODO Auto-generated method stub
		//Aqui va la consulta a la DB
		return true;
	}

	@Override
	public boolean insert(Persona  contacto) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return true;
	}

}
