package com.example.agenda.model;
/*
  `iddireccion` int(11) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(45) NOT NULL,
  `codpostal` varchar(45) NOT NULL,
  `localidad` varchar(45) NOT NULL,
  `idprovincia` int(11) NOT NULL,
  `idpersona` int(11) DEFAULT NULL,
 */
public class Direccion {
	
	private int idDireccion;
	private String direccion;
	private String codPostal;
	private String localidad;
	private int idProvincia;
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

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
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