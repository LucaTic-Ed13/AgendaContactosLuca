package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.*;

public class ContactoDAOImpl implements ContactoDAO {
	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Contacto> list() throws ClassNotFoundException, SQLException {
		return (List<Contacto>) entityManager.createQuery("FROM personas ORDER BY id_personas").getResultList();
	}

	@Override
	public Contacto get(int id) {
		// TODO Auto-generated method stub
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
