package com.BruRoCa.Alumno;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import es.lanyu.commons.identificable.AbstractNombrable;

public class DatosPersonales extends AbstractNombrable {
	private String apellido1;
	private String apellido2;
	private String nif;
	private Domicilio domicilio;
	private String ciudad;
	private int codigoPostal;
	private List <Integer> telefonos = new ArrayList<>();
	private List <String> mailsParticular = new ArrayList<>();
	private List <Vehiculo> vehiculos =  new ArrayList<>();
	private String foto;
	
	
	
	public String getFoto() {
		return foto;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public String getNif() {
		return nif;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	public List<Integer> getTelefonos() {
		return telefonos;
	}
	
	public List<String> getMailsParticular() {
		return mailsParticular;
	}
	
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	protected void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	protected void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	protected void setNif(String nif) {
		this.nif = nif;
	}
	
//	protected void setDomicilio(Domicilio domicilio) {
//		this.domicilio = domicilio;
//	}
	
	protected void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	protected void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	public void AddTelefono(int telefono) {
		if(telefonos != null) {
			telefonos.add(telefono);
		}
		else {
			List<Integer> telefonos = new ArrayList<>();
			telefonos.add(telefono);
		}
	
	}
	
	
	//idem telefono
	public void addMailParticular(String mailParticular) {
		if(mailsParticular != null) {
			mailsParticular.add(mailParticular);
		}
		else {
			List<String> mailsParticular = new ArrayList<>();
			mailsParticular.add(mailParticular);

		}
	
	}
	
	//idem anterior
	public void addVehiculos(Vehiculo vehiculo) {
		if(vehiculos != null) {
		vehiculos.add(vehiculo);
		}
		else {
			List<Vehiculo> vehiculos = new ArrayList<>();
			vehiculos.add(vehiculo);
		}
	}

	public DatosPersonales() {
		super();
	}

	public DatosPersonales(String nombre, String apellido1, String apellido2, String nif, Domicilio domicilio, String ciudad,
			int codigoPostal, List<Integer> telefonos, List<String> mailsParticular, List<Vehiculo> vehiculos) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.domicilio = domicilio;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.telefonos = telefonos;
		this.mailsParticular = mailsParticular;
		this.vehiculos = vehiculos;
	}

	public DatosPersonales(String nombre, String apellido1, String apellido2, String nif) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.domicilio = new Domicilio("", "", "", "");
		this.ciudad = "";
		this.codigoPostal = 0;
		this.foto = "";
		
	}

	@Override
	public String toString() {
		return  getApellido1() + "," + getApellido2() + "," + getNombre() + "," + getNif() + "," + ((getVehiculos().isEmpty())? "No tiene vehiculos": getVehiculos()) ;
	}

	
	
	//alumnos.forEach(e-> System.out.println(e))
	
	
	
	
	

}
