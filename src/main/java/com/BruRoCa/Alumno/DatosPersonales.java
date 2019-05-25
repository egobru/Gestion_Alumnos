package com.BruRoCa.Alumno;

import java.util.List;

import es.lanyu.commons.identificable.AbstractNombrable;

public class DatosPersonales extends AbstractNombrable {
	private String apellido1;
	private String apellido2;
	private String nif;
	private Domicilio domicilio;
	private String ciudad;
	private int codigoPostal;
	private List <Integer> telefonos;
	private List <String> mailsParticular;
	private List <Vehiculo> vehiculos;
	
	
	
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
	
	//IMPLEMENTAR TENIENDO ENCUENTA QUE LA LISTA PUEDE ESTAR VACIA Y HAY QUE CREARLA
	//COMO REFERENCIA VER METODOS DE gESTORiDENTIFICABLES DE LANYU.COMMONS.IDENTIFICABE 
	protected void AddTelefono(int telefono) {
		//this.telefonos = telefonos;
	}
	
	//idem telefono
	protected void addMailsParticular(String mailsParticular) {
	//	this.mailsParticular = mailsParticular;
	}
	
	//idem anterior
	protected void addVehiculos(Vehiculo vehiculo) {
		
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
	}

	@Override
	public String toString() {
		return  getApellido1() + " " + getApellido2() + ",  " + getNombre() + " " + getNif();
	}

	
	
	
	
	
	
	
	

}
