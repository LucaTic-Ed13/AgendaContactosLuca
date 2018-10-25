package com.example.agenda.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.DireccionDAOJPA;
import com.example.agenda.model.Direccion;

@Service
public class DireccionServiceImpl implements DireccionService {

	@Autowired
	DireccionDAOJPA repository;

	@Override
	public Direccion getDireccionById(int id) {
    	return repository.getOne(id);
	}

	@Override
	public void saveDireccion(Direccion Direccion) {
		repository.save(Direccion);
	}

	@Override
	public void updateDireccion(Direccion Direccion) {
		repository.save(Direccion);
	}

	@Override
	public void deleteDireccion(int id) {
		repository.deleteById(id);
	}

	@Transactional
	@Override
	public List<Direccion> getAllDirecciones() {
		List<Direccion> prueba = new ArrayList<>();
		prueba.add(new Direccion(0, "Hola", "Cara", "Cola", 1, 2));
		prueba.addAll(repository.findAll());
		return prueba;
	}

}