package com.BruRoCa.Alumno;

import es.lanyu.commons.identificable.AbstractNombrable;

public class DatosMilitares extends AbstractNombrable {
	private Empleo empleoMilitar;
	private Ejercito ejercito;
	private Cuerpo cuerpo;
	private String mailMilitar;
	private String destinoAnterior;
	private int numeroEscalafon;
	
	
	public Empleo getEmpleo() {
		return empleoMilitar;
	}
	public Ejercito getEjercito() {
		return ejercito;
	}
	
	public Cuerpo getCuerpo() {
		return cuerpo;
	}
	
	public String getMail() {
		return mailMilitar;
	}
	
	public String getDestinoAnterior() {
		return destinoAnterior;
	}
	
	public int getEscalafon() {
		return numeroEscalafon;
	}
	
	protected void setMail(String mail) {
		this.mailMilitar = mail;
	}
	
	protected void setDestinoAnterior(String destinoAnterior) {
		this.destinoAnterior = destinoAnterior;
	}
	
	protected void setEscalafon(int escalafon) {
		this.numeroEscalafon = escalafon;
	}
	
	
	public DatosMilitares() {
		super();
	}
	
	public DatosMilitares(Empleo empleo, Cuerpo cuerpo) {
		super();
		this.empleoMilitar = empleo;
		this.cuerpo = cuerpo;
		

	}
	
	public DatosMilitares(Empleo empleo, Ejercito ejercito, Cuerpo cuerpo, String mail, String destinoAnterior,
			int escalafon) {
		super();
		this.empleoMilitar = empleo;
		this.ejercito = ejercito;
		this.cuerpo = cuerpo;
		this.mailMilitar = mail;
		this.destinoAnterior = destinoAnterior;
		this.numeroEscalafon = escalafon;
	}
	@Override
	public String toString() {
		return getEmpleo() + " " + getEscalafon();
	}
	
	
	
	
	

}
