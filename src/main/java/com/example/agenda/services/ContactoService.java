package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Contacto;

public interface ContactoService {

	public List<Contacto> findAll();

	public Contacto getOne(int id);

	public Contacto save(Contacto contacto);
	
	public void delete(int idContacto);

	

	
}
