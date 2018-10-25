package com.example.agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
  `idtelefono` int(11) NOT NULL AUTO_INCREMENT,
  `telefono` varchar(45) DEFAULT NULL,
  `idpersona` int(11) DEFAULT NULL,
 */
@Entity
@Table(name = "telefono")
public class Telefono {
	
	private int idTelefono;
	private String telefono;
	private int idPersona;
	
	public Telefono(int idTelefono, String telefono, int idPersona) {
		super();
		this.idTelefono = idTelefono;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}
	
	public Telefono() {}

	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	public int getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
		builder.append("Telefono [idTelefono=");
		builder.append(idTelefono);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}

}
