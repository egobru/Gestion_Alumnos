package com.BruRoCa.serial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.BruRoCa.Alumno.Alumno;
import com.BruRoCa.Alumno.AlumnoDAO;
import com.BruRoCa.Alumno.AlumnoMilitar;
import com.BruRoCa.Alumno.Cuerpo;
import com.BruRoCa.Alumno.DatosMilitares;
import com.BruRoCa.Alumno.DatosPersonales;
import com.BruRoCa.Alumno.Empleo;
import com.BruRoCa.Alumno.Vehiculo;
import com.esotericsoftware.jsonbeans.Json;

public class SerializadorCSV implements AlumnoDAO {
	
	private final String ruta;	
	Json json;
	
	public SerializadorCSV(String rutaAcceso) {
		super();
		this.ruta = rutaAcceso;
	}

	
	
	public static List<Alumno> getAlumnos(String rutaAcceso){
		List<Alumno> alumnosLeidos = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(rutaAcceso), "UTF-8"))){
			String linea =reader.readLine(); // para leer la primera linea que es la que no tiene datos
			while ((linea = reader.readLine()) != null) {
				alumnosLeidos.add(deserializarAlumno(linea));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return alumnosLeidos;
	}
	
	public static int guardarListaAJsonPorLineas(Json json, String ruta, Alumno... alumnos) {
		int numeroAlumnosGuardados = 0;
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(ruta), "UTF-8"))) {
			for (AlumnoDAO alumno : alumnos) {
				writer.write(json.toJson(alumno));
				numeroAlumnosGuardados++;
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return numeroAlumnosGuardados;
	}
	
	
	
	

	private static Alumno deserializarAlumno(String linea) {
		Alumno alumno ;
		Vehiculo vehiculo1 = new Vehiculo();
		String lineaEspacio = linea.replace(";", " ; ");
		String[] campos = lineaEspacio.split(";");
	//	Stream.of(campos).forEach(c -> c.trim());
		for (int i = 0; i < campos.length; i++) {
			campos[i]= campos[i].trim();
		}
		String nombreString = campos[0];
		String apllido1String = campos[1];
		String apellido2String = campos[2];
		String nifString = campos[3];
		System.out.println(Arrays.toString(campos));
//		String vehiculo1MarcaString = campos[4];
//		String vehiculo1ModeloString= campos[5];
//		String vehiculo1ColorString = campos[6];
//		String vehiculo1MatriculaString = campos[7];
		String empleoString = campos[8];
		
		String cuerpoString = campos[9];
		
		
	
		
		DatosPersonales datosPersonales = new DatosPersonales(nombreString, apllido1String, apellido2String, nifString);
		
//		String empleo;
//		try {
//			empleo = empleoString;
//		} catch (Exception e) {
//			e.printStackTrace();
//			empleo ="Sdo. Empleo";
//		}
		
		Empleo categoria = new Empleo(empleoString);
		
//		String cuerpo;
//		try {
//			cuerpo = cuerpoString;
//		} catch (Exception e) {
//			e.printStackTrace();
//			cuerpo ="Sdo. Empleo";
//		}
//				
		Cuerpo cuerpoM = new Cuerpo(cuerpoString);
//		
//	
		DatosMilitares datosmilitares = new DatosMilitares(categoria, cuerpoM);
		
		if(empleoString.equals("") && cuerpoString.equals("")) {
			
			Alumno alumnoCivil = new Alumno(datosPersonales);
			alumno = alumnoCivil;
			System.out.println(alumnoCivil);
			
		}
		else {
			AlumnoMilitar alumnoMilitar = new AlumnoMilitar(datosPersonales, datosmilitares);
			alumno = alumnoMilitar;
			System.out.println(alumnoMilitar);
		}
		
//		String marcaModelo;
//		try {
//			if(vehiculo1MarcaString != null && vehiculo1ModeloString !=null) 
//				marcaModelo = vehiculo1MarcaString + vehiculo1ModeloString;
//			if(vehiculo1MarcaString == null && vehiculo1ModeloString !=null) 
//				marcaModelo = "Sdo.Marca" + vehiculo1ModeloString;
//			if(vehiculo1MarcaString != null && vehiculo1ModeloString ==null) 
//				marcaModelo =  vehiculo1ModeloString + "Sdo.Modelo" ;
//			marcaModelo = vehiculo1MarcaString + vehiculo1ModeloString;
//			
//		} catch (Exception e) {
//			System.out.println(e + "peto en el coche");
//			marcaModelo = "Sdo. MarcaModelo";
//		}
//		 String matricula;
//		 try {
//			matricula = vehiculo1MatriculaString;
//		} catch (Exception e) {
//			e.printStackTrace();
//			matricula = "sdo.Matricula";
//		}
//		
//		 String color;
//		 try {
//			color = vehiculo1ColorString;
//		} catch (Exception e) {
//			e.printStackTrace();
//			color = "sdo.Color";
//		}
//		 
//		 if(vehiculo1MatriculaString != null) {
//			 Vehiculo vehiculo = new Vehiculo(marcaModelo, matricula, color);
//			 vehiculo1 = vehiculo;
//		 }else {
//			vehiculo1 = null;
//		}
		
		
		System.out.println(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return getAlumnos(ruta);
	}

	@Override
	public List<Alumno> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Alumno> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Alumno> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Alumno getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Alumno> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Alumno> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Alumno entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Alumno> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Alumno> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Alumno> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public  int guardarAlumnos(Alumno... alumnos) {
		return guardarListaAJsonPorLineas(json, ruta, alumnos);
	}

	@Override
	public <T extends Alumno> T borrarEvento(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Alumno> boolean actualizarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Alumno> findAll() {
		return getAlumnos(ruta);
	}

}
