package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Telefono;

public interface TelefonoService {

	Telefono getTelefonoById(int id);

	void saveTelefono(Telefono Telefono);

	void updateTelefono(Telefono Telefono);

	void deleteTelefono(int id);

	List<Telefono> getAllTelefonos();

}
