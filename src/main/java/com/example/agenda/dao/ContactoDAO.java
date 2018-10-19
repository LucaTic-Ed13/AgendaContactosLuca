package com.example.agenda.dao;

import java.util.List;

import com.example.agenda.model.Contacto;

public interface ContactoDAO {

	public List<Contacto> list();
	
	public Contacto get(int id);
	
	public void update(Contacto contacto);
	
	public void add(Contacto contacto);
	
	public void delete(int id);
	
	

}
