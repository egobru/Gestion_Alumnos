package com.BruRoCa.Alumno;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.lanyu.commons.identificable.GeneradorIdentificadores;

public class GestorAlumnos implements GeneradorIdentificadores<String>{
	Map<String, Alumno> mapaAlumnosPorNombre = new HashMap<>();
	Map<Alumno, String> mapaAlumnoPorIdentificador = new HashMap<>();
	String formato = "DIMXLI-";
	int proximoId = 1;
	
	

	public Map<String, Alumno> getMapaAlumnosPorNombre() {
		return mapaAlumnosPorNombre;
	}






	public Map<Alumno, String> getMapaAlumnoPorIdentificador() {
		return mapaAlumnoPorIdentificador;
	}
	
	public Alumno getParticipante(String id) {
		return getMapaAlumnosPorNombre().get(id);
	}
	
	public boolean registrarAlumno(Alumno alumno) {
		boolean anadido = getMapaAlumnosPorNombre().containsValue(alumno);
		if(!anadido) {
			// me pienso lo de generarlo aqui consultar con BruRoCA
			getMapaAlumnosPorNombre().put(alumno.getIdentificador(), alumno);
			getMapaAlumnoPorIdentificador().put(alumno, alumno.getIdentificador());
		}
		return anadido;
	}
	
	public  GestorAlumnos() {}
	
	
	
	
	@Override
	public String generarId() {
		return String.format(formato, proximoId++);
	}


}
