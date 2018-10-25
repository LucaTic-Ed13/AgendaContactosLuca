package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.agenda.model.Telefono;

@Deprecated
public interface TelefonoDAO {
	
	public List<Telefono> list() throws ClassNotFoundException, SQLException;
	
	public Telefono get(int id) throws ClassNotFoundException, SQLException;
	
	public boolean update(Telefono contacto) throws ClassNotFoundException, SQLException;
	
	public boolean insert(Telefono contacto) throws ClassNotFoundException, SQLException;
	
	public boolean delete(int id) throws ClassNotFoundException, SQLException;

}
