package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.Telefono;

@Deprecated
@Repository
public class TelefonoDAOImpl implements TelefonoDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	public TelefonoDAOImpl() {}

	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Telefono > list() throws ClassNotFoundException, SQLException {
		return (List<Telefono >) entityManager.createQuery("FROM Telefono ORDER BY idTelefono").getResultList();
	}

	@Override
	@Transactional
	public Telefono get(int id) throws ClassNotFoundException, SQLException{
		return (Telefono) entityManager.find(Telefono.class, id);
	}

	@Override
	public boolean update(Telefono  contacto) throws ClassNotFoundException, SQLException {
		Telefono usuario = get(contacto.getIdTelefono());

		usuario.setTelefono(contacto.getTelefono());
		usuario.setIdPersona(contacto.getIdPersona());
		entityManager.flush();
		return true;
	}

	@Override
	public boolean insert(Telefono  contacto) throws ClassNotFoundException, SQLException{
		entityManager.merge(contacto);
		return true;
	}

	@Override
	@Transactional
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		entityManager.remove(get(id));
		return true;
	}

}