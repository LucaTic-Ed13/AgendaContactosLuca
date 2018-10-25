package com.example.agenda.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.ProvinciaDAOImpl;
import com.example.agenda.dao.ProvinciaDAOJPA;
import com.example.agenda.model.Direccion;
import com.example.agenda.model.Persona;
import com.example.agenda.model.Provincia;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

	@Autowired
	ProvinciaDAOJPA repository;

	@Override
	public Provincia getProvinciaById(int id) {
    	return repository.getOne(id);
	}

	@Override
	public void saveProvincia(Provincia Provincia) {
		repository.save(Provincia);
	}

	@Override
	public void updateProvincia(Provincia Provincia) {
		repository.save(Provincia);
	}

	@Override
	public void deleteProvincia(int id) {
		repository.deleteById(id);
	}

	@Transactional
	@Override
	public List<Provincia> getAllProvincias() {
		return repository.findAll();
	}


}
