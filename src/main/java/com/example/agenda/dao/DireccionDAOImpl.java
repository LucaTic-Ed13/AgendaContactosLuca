package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.agenda.model.Direccion;

@Deprecated
@Repository
public class DireccionDAOImpl implements DireccionDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	public DireccionDAOImpl() {}

	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Direccion > list() throws ClassNotFoundException, SQLException {
		return (List<Direccion >) entityManager.createQuery("FROM Direccion ORDER BY idDireccion").getResultList();
	}

	@Override
	@Transactional
	public Direccion get(int id) throws ClassNotFoundException, SQLException{
		return (Direccion) entityManager.find(Direccion.class, id);
	}

	@Override
	public boolean update(Direccion  contacto) throws ClassNotFoundException, SQLException {
		Direccion usuario = get(contacto.getIdDireccion());

		usuario.setDireccion(contacto.getDireccion());
		usuario.setCodPostal(contacto.getCodPostal());
		usuario.setLocalidad(contacto.getLocalidad());
		usuario.setIdProvincia(contacto.getIdProvincia());
		usuario.setIdPersona(contacto.getIdPersona());
		entityManager.flush();
		return true;
	}

	@Override
	public boolean insert(Direccion  contacto) throws ClassNotFoundException, SQLException{
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
