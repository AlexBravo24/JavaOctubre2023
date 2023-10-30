package com;

public class Perro {
	
	private String raza;
	private String tamaño;
	private String sexo;
	private String color;
	private String nombre;
	private int   largoCm;
	private int   altoCm;
	private int  edad;
	
	
	public Perro()  {}


	public Perro(String raza, String tamaño, String sexo, String color, String nombre, int largoCm, int altoCm,
			int edad) {
		super();
		this.raza = raza;
		this.tamaño = tamaño;
		this.sexo = sexo;
		this.color = color;
		this.nombre = nombre;
		this.largoCm = largoCm;
		this.altoCm = altoCm;
		this.edad = edad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLargoCm() {
		return largoCm;
	}


	public void setLargoCm(int largoCm) {
		this.largoCm = largoCm;
	}


	public int getAltoCm() {
		return altoCm;
	}


	public void setAltoCm(int altoCm) {
		this.altoCm = altoCm;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tamaño=" + tamaño + ", sexo=" + sexo + ", color=" + color + ", nombre="
				+ nombre + ", largoCm=" + largoCm + ", altoCm=" + altoCm + ", edad=" + edad + "]";
	}
	

}
