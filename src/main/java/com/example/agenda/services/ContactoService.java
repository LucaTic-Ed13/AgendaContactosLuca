package com.example.agenda.services;

import java.util.List;

import com.ejemplos.spring.model.User;

public interface ContactoService {

	public List<Contacto> list();
	public Contacto get(int idPersona);
	public boolean update(Contacto actual);
	public boolean add(Contacto nuevo);
	public boolean delete(int idPersona);
}
