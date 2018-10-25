package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Direccion;

public interface DireccionService {

	Direccion getDireccionById(int id);

	void saveDireccion(Direccion Direccion);

	void updateDireccion(Direccion Direccion);

	void deleteDireccion(int id);

	List<Direccion> getAllDireccions();

}
