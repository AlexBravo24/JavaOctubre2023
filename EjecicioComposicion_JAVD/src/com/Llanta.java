package com;

public class Llanta {
	
	private String marca;
	private double ancho;
	private double radio;	
	
	public Llanta() {
		
	}

	public Llanta(String marca, double ancho, double radio) {
		super();
		this.marca = marca;
		this.ancho = ancho;
		this.radio = radio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Llanta [marca=" + marca + ", ancho=" + ancho + ", radio=" + radio + "]";
	}
	
}
