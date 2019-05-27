package com.BruRoCa.Alumno;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

public interface AlumnoDAO extends JpaRepository<Alumno, Integer> {
	default Collection<? extends Alumno> getAlumnos(){
		return findAll();
	}
   // Collection<? extends Alumno> getAlumnos(Curso curso);
    <T extends Alumno> int guardarAlumnos(List<Alumno>  alumnos); 
    <T extends Alumno> T borrarEvento(Alumno alumno);
    <T extends Alumno> boolean actualizarAlumno(Alumno alumno);
    <T extends Alumno> void guardarAlumnos(String ruta, List<Alumno>  alumnos) throws IOException; 
    void guardarLista(String ruta, List<String> lista);
    
    @Override
    List<Alumno> findAll() ;
	

}
