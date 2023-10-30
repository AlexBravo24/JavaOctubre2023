package com;

public class Neumatico {

	private String marca;
	private String tamaño;
	private String traccion;
	
	public Neumatico() {}

	public Neumatico(String marca, String tamaño, String traccion) {
		super();
		this.marca = marca;
		this.tamaño = tamaño;
		this.traccion = traccion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	@Override
	public String toString() {
		return "Neumatico [marca=" + marca + ", tamaño=" + tamaño + ", traccion=" + traccion + "]";
	}
	
	
	
}
