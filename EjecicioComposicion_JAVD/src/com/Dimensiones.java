package com;

public class Dimensiones {
	
	double longitud;
	double ancho;
	double altura;
	
	public Dimensiones() {
		
	}

	public Dimensiones(double longitud, double ancho, double altura) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
		this.altura = altura;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Dimensiones [longitud=" + longitud + ", ancho=" + ancho + ", altura=" + altura + "]";
	}

}
