package com.example.agenda.services;

import java.util.List;

import com.example.agenda.model.Provincia;

public interface ProvinciaService {

	Provincia getProvinciaById(int id);

	void saveProvincia(Provincia Provincia);

	void updateProvincia(Provincia Provincia);

	void deleteProvincia(int id);

	List<Provincia> getAllProvincias();

}
