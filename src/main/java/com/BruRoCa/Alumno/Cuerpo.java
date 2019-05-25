package com.BruRoCa.Alumno;

import es.lanyu.commons.identificable.AbstractNombrable;

public class Cuerpo extends AbstractNombrable {

	public Cuerpo() {
		super();
	}
	
	public Cuerpo(String cuerpo) {
		super();
		super.nombre = cuerpo;
	}

	@Override
	public String toString() {
		return getNombre() ;
	}

	
	
}
