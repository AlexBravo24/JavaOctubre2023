package com;

public class Fisico {
	
	private double peso;
	private double grosor;
	private String forma;
	
	public Fisico() {
		
	}

	public Fisico(double peso, double grosor, String forma) {
		super();
		this.peso = peso;
		this.grosor = grosor;
		this.forma = forma;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Fisico [peso=" + peso + ", grosor=" + grosor + ", forma=" + forma + "]";
	}
	
	

}
