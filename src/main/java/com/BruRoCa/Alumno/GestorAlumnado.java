package com.BruRoCa.Alumno;

import java.util.List;
import java.util.stream.Collectors;

public interface GestorAlumnado extends Alumnado {
	
	default <T extends Alumno>  List <T> getAlumnosGestionados(Class<T> tipo){
		return (List<T>) getAlumnos().stream().filter(s -> s.getClass().isAssignableFrom(tipo)).collect(Collectors.toList());

	}
	
	default String getDatosPersonalesAlumno(Alumno alumno){
		return  getAlumnos().stream()
				.filter(s -> ((Alumnado) s).getAlumno().equals(alumno))
				.toString();
	}
	
	
	default <T extends Alumno> void addAlumno(T Alumno) {
		getAlumnos().add(Alumno);
	}
	
	default <T extends Alumno> void addAlumnos(Class<T> tipo, int numero, DatosPersonales datosPersonales) {
		for(int i = 0; i < numero; i++) {
			T alumno;
			try {
				alumno = tipo.newInstance();
				alumno.setDatosPersonales(datosPersonales);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
//			T alumno;
//			try {
//				alumno = tipo.newInstance();
//				alumno.set(alumno);
//				addAlumno(alumno);
//			} catch (InstantiationException | IllegalAccessException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	default <T extends Alumno> void addAlumnosMilitares (Class<T> tipo, int numero, DatosPersonales datosPersonales, DatosMilitares datosMilitares) {
		for(int i = 0; i < numero; i++) {
			T alumnoMilitar;
			try {
				alumnoMilitar = tipo.newInstance();
				alumnoMilitar.setDatosPersonales(datosPersonales);
				((AlumnoMilitar) alumnoMilitar).setDatosMilitares(datosMilitares);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	default <T extends Alumno> void addAlumno(Class<T> tipo, DatosPersonales datosPersonales) {
		addAlumnos(tipo, 1, datosPersonales);
	}
	
	default <T extends Alumno> void addAlumnoMilitar(Class<T> tipo, DatosPersonales datosPersonales, DatosMilitares datosMilitares) {
		addAlumnosMilitares(tipo, 1,datosPersonales,  datosMilitares);
	}
	
}
