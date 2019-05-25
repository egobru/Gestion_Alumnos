package com.BruRoCa.Alumno;

import es.lanyu.commons.identificable.AbstractNombrable;

public class DatosMilitares extends AbstractNombrable {
	private Empleo empleo;
	private Ejercito ejercito;
	private Cuerpo cuerpo;
	private String mail;
	private String destinoAnterior;
	private int escalafon;
	
	
	public Empleo getEmpleo() {
		return empleo;
	}
	public Ejercito getEjercito() {
		return ejercito;
	}
	
	public Cuerpo getCuerpo() {
		return cuerpo;
	}
	
	public String getMail() {
		return mail;
	}
	
	public String getDestinoAnterior() {
		return destinoAnterior;
	}
	
	public int getEscalafon() {
		return escalafon;
	}
	
	protected void setMail(String mail) {
		this.mail = mail;
	}
	
	protected void setDestinoAnterior(String destinoAnterior) {
		this.destinoAnterior = destinoAnterior;
	}
	
	protected void setEscalafon(int escalafon) {
		this.escalafon = escalafon;
	}
	
	
	public DatosMilitares() {
		super();
	}
	
	public DatosMilitares(Empleo empleo, Cuerpo cuerpo) {
		super();
		this.empleo = empleo;
		this.cuerpo = cuerpo;

	}
	
	public DatosMilitares(Empleo empleo, Ejercito ejercito, Cuerpo cuerpo, String mail, String destinoAnterior,
			int escalafon) {
		super();
		this.empleo = empleo;
		this.ejercito = ejercito;
		this.cuerpo = cuerpo;
		this.mail = mail;
		this.destinoAnterior = destinoAnterior;
		this.escalafon = escalafon;
	}
	@Override
	public String toString() {
		return getEmpleo() + " " + getEscalafon();
	}
	
	
	
	
	

}
