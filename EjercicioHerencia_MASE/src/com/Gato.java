package com;

public class Gato  extends Animal{

	private String raza;
	private int edad;
	private String color;
	
	public Gato() {}

	public Gato(String raza, int edad, String color) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Gato [raza=" + raza + ", edad=" + edad + ", color=" + color + ", getNombre()=" + getNombre()
				+ ", getEspecie()=" + getEspecie() + ", getTipo()=" + getTipo() + "]";
	}



}
