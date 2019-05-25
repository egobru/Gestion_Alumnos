package com.BruRoCa.Alumno;

import es.lanyu.commons.identificable.AbstractNombrable;

public class Empleo extends AbstractNombrable {

	public Empleo() {
		super();
	}
	
	public Empleo(String empleo) {
		super();
		super.nombre = empleo;
	}

	@Override
	public String toString() {
		return  (getNombre() == "")? "¿?":getNombre();
	}

	
	
}
