package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.agenda.model.Contacto;

public interface ContactoDAO {

	public List<Contacto> list() throws ClassNotFoundException, SQLException;
	
	public Contacto get(int id);
	
	public boolean update(Contacto contacto);
	
	public boolean insert(Contacto contacto);
	
	public boolean delete(int id);
	
}
