package com.BruRoCa.Alumno;

public class AlumnoMilitar extends Alumno {
	private DatosMilitares datosMilitares;

	public DatosMilitares getDatosMilitares() {
		return datosMilitares;
	}

	protected void setDatosMilitares(DatosMilitares datosMilitares) {
		this.datosMilitares = datosMilitares;
	}

	
	
	public AlumnoMilitar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoMilitar(DatosPersonales datosPersonales, DatosMilitares datosmilitares) {
		super(datosPersonales);
		this.datosMilitares = datosmilitares;
	}

	public AlumnoMilitar(String nombre, String apellido1, String apellido2, DatosMilitares datosMilitares) {
		super();
		super.getDatosPersonales().setApellido1(apellido1);
		super.getDatosPersonales().setApellido2(apellido2);
		
		this.datosMilitares = datosMilitares;
	}

	@Override
	public String toString() {
		return  getDatosMilitares().getEmpleo().toString();
	}
	
	
	

}
