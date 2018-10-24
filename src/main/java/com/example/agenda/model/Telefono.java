package com.example.agenda.model;

/*
  `idtelefono` int(11) NOT NULL AUTO_INCREMENT,
  `telefono` varchar(45) DEFAULT NULL,
  `idpersona` int(11) DEFAULT NULL,
 */

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

	public int getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

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
