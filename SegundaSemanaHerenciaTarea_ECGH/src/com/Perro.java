package com;

public class Perro extends Animal{
	
	private String raza;
	private String color;
	private String tamaño;
	
	public Perro() {}

	public Perro(String nombre, String especie, String tipo, String raza, String color, String tamaño) {
		super(nombre, especie, tipo);
		this.raza = raza;
		this.color = color;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	

}
