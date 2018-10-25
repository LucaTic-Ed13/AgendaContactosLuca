package com.example.agenda.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.ProvinciaDAOJPA;
import com.example.agenda.dao.TelefonoDAOImpl;
import com.example.agenda.dao.TelefonoDAOJPA;
import com.example.agenda.model.Direccion;
import com.example.agenda.model.Persona;
import com.example.agenda.model.Telefono;

@Service
public class TelefonoServiceImpl implements TelefonoService {

	@Autowired
	TelefonoDAOJPA repository;

	@Override
	public Telefono getTelefonoById(int id) {
    	return repository.getOne(id);
	}

	@Override
	public void saveTelefono(Telefono Telefono) {
		repository.save(Telefono);
	}

	@Override
	public void updateTelefono(Telefono Telefono) {
		repository.save(Telefono);
	}

	@Override
	public void deleteTelefono(int id) {
		repository.deleteById(id);
	}

	@Transactional
	@Override
	public List<Telefono> getAllTelefonos() {
		return repository.findAll();
	}


}
