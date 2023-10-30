package com;

public class Motor {
	
	String tipo;
	double tama�o;
	double cilindros;
	
	public Motor() {
		
	}

	public Motor(String tipo, double tama�o, double cilindros) {
		super();
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.cilindros = cilindros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public double getCilindros() {
		return cilindros;
	}

	public void setCilindros(double cilindros) {
		this.cilindros = cilindros;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", tama�o=" + tama�o + ", cilindros=" + cilindros + "]";
	}

}
