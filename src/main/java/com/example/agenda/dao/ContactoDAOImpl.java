package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.*;

@Repository
public class ContactoDAOImpl implements ContactoDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	public ContactoDAOImpl() {}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Contacto> list() throws ClassNotFoundException, SQLException {
		return (List<Contacto>) entityManager.createQuery("FROM personas ORDER BY id_personas").getResultList();
	}

	@Override
	public Contacto get(int id) {
		// TODO Auto-generated method stubsa
		return null;
	}

	@Override
	public boolean update(Contacto contacto) {
		// TODO Auto-generated method stub
		//Aqui va la consulta a la DB
		return true;
	}

	@Override
	public boolean insert(Contacto contacto) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return true;
	}

}
