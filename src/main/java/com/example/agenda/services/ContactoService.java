package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Contacto;

public interface ContactoService {

	public List<Contacto> list();
	public Contacto get(int id);
	public boolean update(Contacto actual);
	public boolean add(Contacto nuevo);
	public boolean delete(int idPersona);
}
