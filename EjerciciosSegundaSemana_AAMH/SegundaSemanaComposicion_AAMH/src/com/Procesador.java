package com;

public class Procesador {
	
	private String marca;
	private String tipo;
	private double frecuencia;
	
	public Procesador () {}

	public Procesador(String marca, String tipo, double frecuencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.frecuencia = frecuencia;
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

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", tipo=" + tipo + ", frecuencia=" + frecuencia + "]";
	}
	
	

}
