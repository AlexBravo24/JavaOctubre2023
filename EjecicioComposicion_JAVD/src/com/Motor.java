package com;

public class Motor {
	
	String tipo;
	double tamaño;
	double cilindros;
	
	public Motor() {
		
	}

	public Motor(String tipo, double tamaño, double cilindros) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.cilindros = cilindros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public double getCilindros() {
		return cilindros;
	}

	public void setCilindros(double cilindros) {
		this.cilindros = cilindros;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", tamaño=" + tamaño + ", cilindros=" + cilindros + "]";
	}

}
