package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Contacto;

public interface ContactoService {

	public List<Contacto> list();
	public Contacto get(int id);
	public void update(Contacto actual);
	public void add(Contacto nuevo);
	public void delete(int idPersona);
}
