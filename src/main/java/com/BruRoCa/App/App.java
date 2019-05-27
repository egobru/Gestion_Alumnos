package com.BruRoCa.App;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import com.BruRoCa.Alumno.Alumno;
import com.BruRoCa.Alumno.AlumnoDAO;
import com.BruRoCa.serial.GuardarArchivos;
import com.BruRoCa.serial.Serializador;
import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.OutputType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App {
	AlumnoDAO alumnoDAO;
	


	public static void main(String[] args) throws IOException {
		System.out.println("Hola Mundo");
		
		List<Alumno> alumnos = new ArrayList<>();
		Json json = new Json(OutputType.json);
		String rutaJson =  "guardados/alumnos.json";
		String rutaCsv= "datos/alumnosDIM.csv";
		
		String rutaCsvGuardar = "guardados/alumnos.csv";
		String rutaPretty = "guardados/Prettyalumnos.json";
	 //String SAMPLE_CSV_FILE = "C:\\Users\\kzurr\\OneDrive\\Escritorio\\alumnosDIM.csv";
		
		App app = new App();
		
		//LEER DESDE EL CSV
		
		app.alumnoDAO = new Serializador(rutaCsv);
		
		alumnos = app.alumnoDAO.findAll();
			
		alumnos.forEach(e-> System.out.println(e));
		
		System.out.println("hasta aqui llega");
		
		//guardar en JSON
		
		app.alumnoDAO = new Serializador(rutaJson);
		app.alumnoDAO.guardarAlumnos(alumnos);
		
		
		//GUARDAR A CSV 
		
		app.alumnoDAO = new Serializador(rutaCsvGuardar);
		
		app.alumnoDAO.guardarAlumnos(rutaCsvGuardar, alumnos);
		
		
		//guardar en un pretty Json
		Gson gson = new Gson();
		String json1 = gson.toJson(alumnos.get(0));
			
		System.out.println(json1);
		
		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
		String jsonOutput = gson2.toJson(alumnos.get(0));
		System.out.println(jsonOutput);
		
		List<String> pretty = new ArrayList<>();
		
		for (int i = 0; i < alumnos.size(); i++) {
			pretty.add(gson2.toJson(alumnos.get(i)));
		}
		
//		pretty.forEach(e-> System.out.println(e));
		
		GuardarArchivos guardarArchivos = new GuardarArchivos();
		
		guardarArchivos.GuardarArchivo(rutaPretty, pretty);
		
	
	    }
		
		
	

}
