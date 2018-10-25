package com.example.agenda.services;


import java.util.List;
import com.example.agenda.model.Persona;
//import org.springframework.beans.factory.annotation.Autowired;
public interface PersonaService  {
	 
	public  Persona getContactoById(int id);
	   public  void saveContacto(Persona persona);
	   public  void updateContacto(Persona persona);
	   public  void deleteContacto(int id);
	   public  List<Persona> getAllContactos();
}
