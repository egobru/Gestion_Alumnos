package com.BruRoCa.Alumno;

import es.lanyu.commons.identificable.AbstractNombrable;

public class Domicilio extends AbstractNombrable {
	
	private String tipoVia;
	private String numeroPortal;
	private String piso;
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	
	public String getNumeroPortal() {
		return numeroPortal;
	}
	
	public String getPiso() {
		return piso;
	}
	
	protected void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	
	protected void setNumeroPortal(String numeroPortal) {
		this.numeroPortal = numeroPortal;
	}
	
	protected void setPiso(String piso) {
		this.piso = piso;
	}

	public Domicilio() {
		super();
	}

	public Domicilio(String nombreCalle, String tipoVia, String numeroPortal, String piso) {
		super();
		super.setNombre(nombreCalle);//¿que diferencia hay?
		//this.nombre = nombreCalle;
		this.tipoVia = tipoVia;
		this.numeroPortal = numeroPortal;
		this.piso = piso;
	}

	@Override
	public String toString() {
		return  getTipoVia() + "/ " + getNombre() + " " + getNumeroPortal() + " ,"	+ getPiso();
	}
	
	
	
	
	
	

}
