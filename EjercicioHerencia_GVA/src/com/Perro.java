package com;

public class Perro extends Animal {
	
	private String nombre;
	private String raza;
	private double peso;
	private int edad;
	private String color;
	
	public Perro() {}

	public Perro(String habitat, String anatomia, String alimentacion, String nombre, String raza, double peso,
			int edad, String color) {
		super(habitat, anatomia, alimentacion);
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
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
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", edad=" + edad + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
