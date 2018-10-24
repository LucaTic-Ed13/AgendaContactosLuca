package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.agenda.model.Persona ;

@Deprecated
public interface PersonaDAO {

	public List<Persona > list() throws ClassNotFoundException, SQLException;
	
	public Persona  get(int id) throws ClassNotFoundException, SQLException;
	
	public boolean update(Persona contacto);
	
	public boolean insert(Persona  contacto);
	
	public boolean delete(int id);
	
}
