package com.example.agenda.model;

import java.util.ArrayList;

public class Contacto {
	
	private Persona persona;
	private ArrayList <String> telefonos;
	private ArrayList <String[]> direcciones;
	
	
	public Contacto(Persona persona, ArrayList<String> telefonos, ArrayList<String[]> direcciones) {
		super();
		this.persona = persona;
		this.telefonos = telefonos;
		this.direcciones = direcciones;
	}


	public Contacto(Persona persona) {
		super();
		this.persona = persona;
		this.telefonos = new ArrayList<String>();
		this.direcciones = new ArrayList <String[]>();
	}
	
	public Contacto() {}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public ArrayList<String> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}


	public ArrayList<String[]> getDirecciones() {
		return direcciones;
	}


	public void setDirecciones(ArrayList<String[]> direcciones) {
		this.direcciones = direcciones;
	}
	
	public void addTelefono(String telefono) {
		this.telefonos.add(telefono);
	}
	
	public void addDireccion(String direccion, String codPostal, String localidad, String provNombre) {
		String [] entrada = {direccion, codPostal, localidad, provNombre};
		this.direcciones.add(entrada);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [persona=");
		builder.append(persona);
		builder.append(", telefonos=");
		builder.append(telefonos.get(0).toString());
		builder.append(", direcciones=");
		builder.append(direcciones.get(0).toString());
		builder.append("]");
		return builder.toString();
	}

}
