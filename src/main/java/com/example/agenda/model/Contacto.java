package com.example.agenda.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.MapsId;


@Entity
public class Contacto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@AttributeOverrides({
        @AttributeOverride(name="nombre", column=@Column(name="nombre")),
        @AttributeOverride(name="apellido1", column=@Column(name="apellido1")),
        @AttributeOverride(name="apellido2", column=@Column(name="apellido2"))
	 })
	@OneToOne(
			mappedBy="idPersona",
			cascade = CascadeType.ALL 
			)
	private Persona persona;
	@MapsId("idPersona")
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="telefono", column=@Column(name="telefono"))
    })
	@OneToMany(
			mappedBy = "idPersona",
	        cascade = CascadeType.ALL 
	    )
	//@OneToMany(mappedBy="idPersona")
	private ArrayList <Telefono> telefonos;
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="direccion", column=@Column(name="direccion")),
        @AttributeOverride(name="codpostal", column=@Column(name="codPostal"))
    })
	@OneToMany(
			mappedBy = "idPersona",
	        cascade = CascadeType.ALL
	    )
	//@OneToMany(mappedBy="idPersona")
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
	
	public void addDireccion(Direccion nueva) {
		this.direcciones.add(nueva);
	}
	
	public void addTelefono(Telefono nuevo) {
		this.telefonos.add(nuevo);
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
