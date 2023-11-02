package com;
//Esta clase va a ser nuestra clase Padre o 
//Superclase

public class Animal {
	
	
	//Atributos
	private String nombre;
	private String especie;
	private String tipo;
	
	//Constructor vacío con todo sus parametros
	public Animal() {
		
	}

	public Animal(String nombre, String especie, String tipo) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
	}
	
	//Generar getters y setters

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
	
	//Generar el metodo to String
	

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", tipo=" + tipo + "]";
	}
	
}
