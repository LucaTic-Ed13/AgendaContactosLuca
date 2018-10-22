package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Persona;

public interface PersonaService {

	public List<Persona> list();

	public Persona get(int id);

	public boolean update(Persona actual);

	public boolean add(Persona nuevo);

	public boolean delete(int idPersona);
}
