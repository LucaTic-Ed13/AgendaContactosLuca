package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.agenda.model.Provincia;

@Deprecated
public interface ProvinciaDAO {
	
	public List<Provincia> list() throws ClassNotFoundException, SQLException;
	
	public Provincia get(int id) throws ClassNotFoundException, SQLException;
	
	public boolean update(Provincia contacto) throws ClassNotFoundException, SQLException;
	
	public boolean insert(Provincia contacto) throws ClassNotFoundException, SQLException;
	
	public boolean delete(int id) throws ClassNotFoundException, SQLException;

}
