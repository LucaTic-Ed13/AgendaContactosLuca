package com.example.agenda.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.agenda.model.Direccion;

@Deprecated
public interface DireccionDAO {
	
	public List<Direccion> list() throws ClassNotFoundException, SQLException;
	
	public Direccion get(int id) throws ClassNotFoundException, SQLException;
	
	public boolean update(Direccion contacto) throws ClassNotFoundException, SQLException;
	
	public boolean insert(Direccion contacto) throws ClassNotFoundException, SQLException;
	
	public boolean delete(int id) throws ClassNotFoundException, SQLException;

}
