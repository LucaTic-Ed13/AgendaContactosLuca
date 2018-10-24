package com.example.agenda.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
  `iddireccion` int(11) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(45) NOT NULL,
  `codpostal` varchar(45) NOT NULL,
  `localidad` varchar(45) NOT NULL,
  `idprovincia` int(11) NOT NULL,
  `idpersona` int(11) DEFAULT NULL,
 */
@Entity
@Embeddable
@Table (name = "direccion")
public class Direccion {
	
	@Id
	@GeneratedValue
	private int idDireccion;
	private String direccion;
	private String codPostal;
	private String localidad;
	private int idProvincia;
	@ManyToOne
	private int idPersona;
	
	public Direccion(int idDireccion, String direccion, String codPostal, String localidad, int idProvincia, int idPersona) {
		super();
		this.idDireccion = idDireccion;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.idProvincia = idProvincia;
		this.idPersona = idPersona;
	}
	
	public Direccion() {}

	@Column(name = "iddireccion")
	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	@Column(name = "direccion")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "codpostal")
	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	@Column(name = "localidad")
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Column(name = "idprovincia")
	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	@Column(name = "idpersona")
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [idDireccion=");
		builder.append(idDireccion);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", codPostal=");
		builder.append(codPostal);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", idProvincia=");
		builder.append(idProvincia);
		builder.append(", idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}
	
	

}
