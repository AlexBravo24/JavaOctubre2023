package com;

public class Almacenamiento {

	private String marca;
	private String modelo;
	private String tipo;
	private double capacidad;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String marca, String modelo, String tipo, double capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", capacidad=" + capacidad
				+ "]";
	}
	
	
	
}
