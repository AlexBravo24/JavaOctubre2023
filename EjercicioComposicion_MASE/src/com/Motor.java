package com;

public class Motor {
	private String marca;
	private String tipo;
	private double tipomotor;
	
	public Motor() {}

	public Motor(String marca, String tipo, double tipomotor) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tipomotor = tipomotor;
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

	public double getTipomotor() {
		return tipomotor;
	}

	public void setTipomotor(double tipomotor) {
		this.tipomotor = tipomotor;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", tipo=" + tipo + ", tipomotor=" + tipomotor + "]";
	}
	
	
	

}
