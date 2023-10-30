package com;

public class Gato extends Animal {
	
	private String tamaño;
	private String visión;
	private String raza;
	private int domesticación;
	
	public Gato () {}

	public Gato(String nombre, String especie, String tipo, String tamaño, String visión, String raza,
			int domesticación) {
		super(nombre, especie, tipo);
		this.tamaño = tamaño;
		this.visión = visión;
		this.raza = raza;
		this.domesticación = domesticación;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getVisión() {
		return visión;
	}

	public void setVisión(String visión) {
		this.visión = visión;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getDomesticación() {
		return domesticación;
	}

	public void setDomesticación(int domesticación) {
		this.domesticación = domesticación;
	}

	@Override
	public String toString() {
		return "Gato [tamaño=" + tamaño + ", visión=" + visión + ", raza=" + raza + ", domesticación=" + domesticación
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
