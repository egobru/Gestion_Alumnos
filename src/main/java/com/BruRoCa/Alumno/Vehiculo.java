package com.BruRoCa.Alumno;

import es.lanyu.commons.identificable.AbstractNombrable;

public class Vehiculo extends AbstractNombrable {
	
	private String color;

	protected String getColor() {
		return color;
	}

	@Override
	public void setNombre(String marcaModelo) {
		super.setNombre(marcaModelo);
	}

	@Override
	public String getIdentificador() {
		return super.getIdentificador();
	}

	@Override
	public void setIdentificador(String matricula) {
		super.setIdentificador(matricula);
	}

	public Vehiculo() {
		super();
	}

	public Vehiculo(String marcaModelo, String matricula, String color) {
		super();
		super.nombre = marcaModelo;
		super.id = matricula;
		this.color = color;
	}

	@Override
	public String toString() {
		return getNombre() + " " +getIdentificador();
	}
	
	
	
	
	
	

}
