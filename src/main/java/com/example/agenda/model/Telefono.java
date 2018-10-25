package com.example.agenda.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
  `idtelefono` int(11) NOT NULL AUTO_INCREMENT,
  `telefono` varchar(45) DEFAULT NULL,
  `idpersona` int(11) DEFAULT NULL,
 */

@Entity
@Embeddable
@Table(name = "telefono")
public class Telefono {
	
	@Id
	@GeneratedValue
	private int idTelefono;
	private String telefono;
	//@ManyToOne
	private int idPersona;
	
	
	public Telefono(int idTelefono, String telefono, int idPersona) {
		super();
		this.idTelefono = idTelefono;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}
	
	public Telefono() {}

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
