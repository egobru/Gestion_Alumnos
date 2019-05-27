package com.BruRoCa.serial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
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
import com.BruRoCa.Curso.Curso;
import com.esotericsoftware.jsonbeans.Json;


public class Serializador implements AlumnoDAO {
	
	private final String ruta;	
	Json json = new Json();
	
	public Serializador(String rutaAcceso) {
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
	
	
	private static int guardarListaAJsonPorLineas(Json json, List<Alumno> alumnos, String ruta) {
		int numeroAlumnosGuardados = 0;
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(ruta), "UTF-8"))) {
			for (Alumno alumno : alumnos) {
				writer.write(json.toJson(alumno));
				numeroAlumnosGuardados++;
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numeroAlumnosGuardados;
	}
	
	private static  void guardarListaAJsonLista(Json json, List<String> lista, String ruta) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(ruta), "UTF-8"))) {
			for (String string : lista) {
				writer.write(json.toJson(string));
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void guardarStringEnFichero(String cadena, String ruta) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(ruta), "UTF-8"))) {
			writer.write(cadena);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void guardarStringEnCSV(String rutaCsvGuardar, List<Alumno> alumnos) throws IOException {
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(rutaCsvGuardar));

	            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
	            		//aqui poner la primera fila a nuestro GUSTO SE PUEDE TUNNERAR CON UNA LIST AL GUSTO 
	                    .withHeader("EMPLEO", "CUERPO", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "NOMBRE", "NIF", "VEHICULO"));
	        ) {alumnos.forEach(e-> {
				try {
					csvPrinter.printRecord(e);
					 csvPrinter.flush(); 
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			});
	                
	        }
	}
	
	

	private static Alumno deserializarAlumno(String linea) {
		Alumno alumno ;
		//CAMBIO QUE ESTE SEPARADO ENTRE ; A QUE ESTE SEPARADO ENTRE ESPACIO ; ESPACIO
		String lineaEspacio = linea.replace(";", " ; ");
		//LEE EL ARRAY ENTRE ; DE ESTA FORMA ELIMNO LOS CAMPOS QUE ESTAN VACIOS
		String[] campos = lineaEspacio.split(";");
		
		//ELIMINO EL ESPACIO QUE HAY POR DEANTE Y POR DETRAS DEL ;
		for (int i = 0; i < campos.length; i++) {
			campos[i]= campos[i].trim();
		}
		
		String nombreString = campos[0];
		String apllido1String = campos[1];
		String apellido2String = campos[2];
		String nifString = campos[3];
//		System.out.println(Arrays.toString(campos));
		String vehiculo1MarcaString = campos[4];
		String vehiculo1ModeloString= campos[5];
		String vehiculo1ColorString = campos[6];
		String vehiculo1MatriculaString = campos[7];
		String empleoString = campos[8];	
		String cuerpoString = campos[9];
		String cursoString = campos [10];
		
		//CREO OBJETO dATOS PERSONALES
		DatosPersonales datosPersonales = new DatosPersonales(nombreString, apllido1String, apellido2String, nifString);
		
		//CREO OBJETO 
		Empleo empleo = new Empleo(empleoString);
		
		//CREO EL OBJETO CUERPO 
		Cuerpo cuerpo = new Cuerpo(cuerpoString);

		//CREO EL OBJETO DATOS MILITARES
		DatosMilitares datosmilitares = new DatosMilitares(empleo, null, cuerpo, "", "", 0);// DatosMilitares(empleo, cuerpo);
		
		//EN FUNCIO DE LOS CAMPOS QUE TIENE DIGO SI ES MILITAR O CIVIL
		if(empleoString.equals("") && cuerpoString.equals("")) {	
			alumno = new Alumno(datosPersonales);
//			System.out.println(alumno);		
		}
		else {		
			alumno = new AlumnoMilitar(datosPersonales, datosmilitares);
//			System.out.println(alumno);
		}
		//CREO EL OBJETO VEHICULO
		Vehiculo vehiculo = new Vehiculo(vehiculo1ModeloString + " " + vehiculo1MarcaString, vehiculo1MatriculaString, vehiculo1ColorString);
		//System.out.println(vehiculo);
		
		//A�ADO EL VEHICULO AL ALUMNO
		alumno.getDatosPersonales().addVehiculos(vehiculo);
		
		//A�ADO EL mailPrticular AL ALUMNO
		alumno.getDatosPersonales().addMailParticular("");

		//A�ADO EL mailPrticular AL ALUMNO
		alumno.getDatosPersonales().AddTelefono(0);

		//A�ADO EL curso AL ALUMNO
		alumno.addCurso(new Curso(cursoString));
		
//		System.out.println(alumno);
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



	@Override
	public <T extends Alumno> int guardarAlumnos(List<Alumno> alumnos) {
		// TODO Auto-generated method stub
		return guardarListaAJsonPorLineas(json, alumnos, ruta);
	}



	@Override
	public <T extends Alumno> void guardarAlumnos(String ruta, List<Alumno> alumnos) throws IOException {
		guardarStringEnCSV(ruta, alumnos);
		
	}



	@Override
	public void guardarLista(String ruta, List<String> lista) {
		guardarLista(ruta, lista);
		
	}



	

}
