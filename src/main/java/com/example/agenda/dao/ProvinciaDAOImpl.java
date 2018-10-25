package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.Provincia;

@Deprecated
@Repository
public class ProvinciaDAOImpl implements ProvinciaDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	public ProvinciaDAOImpl() {}

	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Provincia> list() throws ClassNotFoundException, SQLException {
		return (List<Provincia>) entityManager.createQuery("FROM Provincia ORDER BY idProvincia").getResultList();
	}

	@Override
	@Transactional
	public Provincia get(int id) throws ClassNotFoundException, SQLException{
		return (Provincia) entityManager.find(Provincia.class, id);
	}

	@Override
	public boolean update(Provincia  contacto) throws ClassNotFoundException, SQLException {
		Provincia usuario = get(contacto.getIdProvincia());

		usuario.setNombre(contacto.getNombre());
		entityManager.flush();
		return true;
	}

	@Override
	public boolean insert(Provincia  contacto) throws ClassNotFoundException, SQLException{
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