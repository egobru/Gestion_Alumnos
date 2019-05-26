package com.BruRoCa.App;

import java.util.ArrayList;
import java.util.List;

import com.BruRoCa.Alumno.Alumno;
import com.BruRoCa.Alumno.AlumnoDAO;
import com.BruRoCa.serial.SerializadorCSV;
import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.OutputType;

public class App {
	AlumnoDAO alumnoDAO;

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		List<Alumno> alumnos = new ArrayList<>();
		Json json = new Json(OutputType.json);
		String rutaCsv= "datos/alumnosDIM.csv";
		String rutaJson = "guardados/alumnos.json";
		
		App app = new App();
		
		//LEER DESDE EL CSV
		
		app.alumnoDAO = new SerializadorCSV(rutaCsv);
		
		alumnos = app.alumnoDAO.findAll();
	
//		Alumno primero = alumnos.get(0);
//		System.out.println(primero);
//		System.out.println(primero.getDatosPersonales().getVehiculos());
		
		alumnos.forEach(e-> System.out.println(e));
		
		System.out.println("hasta aqui llega");
		
		//guardar en JSON
		
		app.alumnoDAO = new SerializadorCSV(rutaJson);
		app.alumnoDAO.guardarAlumnos(alumnos);
		
		
		//app.alumnoDAO.guardarAlumnos(alumnos.toArray(new Alumno[] {}));
		
	}

}
