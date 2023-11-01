package com;

public class Animal {
	
	//Esta clase va a ser nuestra clase Padre o
	//Superclase
	
	private String nombre;
	private String especie;
	private String tipo;
	
	public Animal () {}

	public Animal(String nombre, String especie, String tipo) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", tipo=" + tipo + "]";
	}
	
	
	

}