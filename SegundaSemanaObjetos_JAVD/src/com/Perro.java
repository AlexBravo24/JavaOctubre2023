package com;

public class Perro {

	private String raza, color, genero;
	
	public Perro() {
		
	}

	public Perro(String raza, String color, String genero) {
		super();
		this.raza = raza;
		this.color = color;
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", genero=" + genero + "]";
	}
	
}
