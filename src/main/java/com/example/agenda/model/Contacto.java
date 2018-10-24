package com.example.agenda.model;

import java.util.ArrayList;

public class Contacto {
	
	private Persona persona;
	private ArrayList <Telefono> telefonos;
	private ArrayList <Direccion> direcciones;
	
	
	public Contacto(Persona persona, ArrayList<Telefono> telefonos, ArrayList<Direccion> direcciones) {
		super();
		this.persona = persona;
		this.telefonos = telefonos;
		this.direcciones = direcciones;
	}


	public Contacto(Persona persona) {
		super();
		this.persona = persona;
	}
	
	public Contacto() {}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}


	public ArrayList<Direccion> getDirecciones() {
		return direcciones;
	}


	public void setDirecciones(ArrayList<Direccion> direcciones) {
		this.direcciones = direcciones;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [persona=");
		builder.append(persona);
		builder.append(", telefonos=");
		builder.append(telefonos);
		builder.append(", direcciones=");
		builder.append(direcciones);
		builder.append("]");
		return builder.toString();
	}
	
}
