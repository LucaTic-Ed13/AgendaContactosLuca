package com.example.agenda.services;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.example.agenda.dao.PersonaDAOJPA;
	import com.example.agenda.model.Persona;

	@Service
	public  class PersonaServiceImpl implements PersonaService {
		
	    @Autowired
	   PersonaDAOJPA repository;

	    
	   
	    @Override
	   public Persona getContactoById(int id)
	   {
	       return repository.getOne(id);
	   }
	    @Override
	   public void saveContacto(Persona persona)
	   {
	       repository.save(persona);
	   }
	    @Override
	   public void updateContacto(Persona persona)
	   {
	       repository.save(persona);
	   }
	    @Override
	   public void deleteContacto(int id)
	   {
	       repository.deleteById(id);
	   }
	   @Transactional
	   @Override
	   public List<Persona> getAllContactos()
	   {
	      return repository.findAll();
	   }
	    
	}

