package com;

//La HERENCIA, se realiza con la palabra reservada
public class Perro extends Animal {
	
	
	//atributos propios de un perro
	
	private String raza;
	private int edad;
	private String color;
	
	public Perro () {}

	public Perro(String nombre, String especie, String tipo, String raza, int edad, String color) {
		super(nombre, especie, tipo);
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
		return "Perro [raza=" + raza + ", edad=" + edad + ", color=" + color + ", toString()=" + super.toString() + "]";
	}
	
	

}