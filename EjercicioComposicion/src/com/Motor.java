package com;

public class Motor {

	private String combustible;
	private String tipo;
	private int cilindro;
	
	public Motor() {}

	public Motor(String combustible, String tipo, int cilindro) {
		super();
		this.combustible = combustible;
		this.tipo = tipo;
		this.cilindro = cilindro;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCilindro() {
		return cilindro;
	}

	public void setCilindro(int cilindro) {
		this.cilindro = cilindro;
	}

	@Override
	public String toString() {
		return "Motor [combustible=" + combustible + ", tipo=" + tipo + ", cilindro=" + cilindro + "]";
	}
	
	
	
}
