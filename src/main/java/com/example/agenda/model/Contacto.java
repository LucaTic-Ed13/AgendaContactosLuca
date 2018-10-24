package com.example.agenda.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Contacto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@AttributeOverrides({
        @AttributeOverride(name="nombre", column=@Column(name="nombre")),
        @AttributeOverride(name="apellido1", column=@Column(name="apellido1")),
        @AttributeOverride(name="apellido2", column=@Column(name="apellido2")),
        @AttributeOverride(name="direccion", column=@Column(name="direccion")),
        @AttributeOverride(name="codPostal", column=@Column(name="codPostal")),
        @AttributeOverride(name="telefono", column=@Column(name="telefono"))
    })
	
	@EmbeddedId
	@OneToOne(mappedBy="idPersona")
	private Persona persona;
	@MapsId("idPersona")
	
	@Embedded
	@OneToMany(mappedBy="idPersona")
	private ArrayList <Telefono> telefonos;
	
	@Embedded
	@OneToMany(mappedBy="idPersona")
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
