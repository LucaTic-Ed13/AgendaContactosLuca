package com.example.agenda.model;
/*
  `idprovincia` int(2) NOT NULL AUTO_INCREMENT,
  `provincia` varchar(255) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "provincia")
public class Provincia {
	
	@Id
	@GeneratedValue
	private int idProvincia;
	private String nombre;
	
	public Provincia(int idProvincia, String nombre) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}
	
	public Provincia() {}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincia [idProvincia=");
		builder.append(idProvincia);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

}
