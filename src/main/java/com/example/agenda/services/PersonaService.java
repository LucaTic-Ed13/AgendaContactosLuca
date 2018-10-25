package com.example.agenda.services;


import java.util.List;
import com.example.agenda.model.Persona;
//import org.springframework.beans.factory.annotation.Autowired;
public interface PersonaService  {
	 
	public Persona getPersonaById(int id);
	public void savePersona(Persona persona);
	public void updatePersona(Persona persona);
	public void deletePersona(int id);
	public List<Persona> getAllPersonas();
}
