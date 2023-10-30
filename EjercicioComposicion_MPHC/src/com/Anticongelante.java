package com;

public class Anticongelante {
	
	private String marca;
	private String tipo;
	private double capacidad;
	
	
	public Anticongelante() {}


	public Anticongelante(String marca, String tipo, double capacidad) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
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
		return "Anticongelante [marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}


	
	
	
	
	

}
