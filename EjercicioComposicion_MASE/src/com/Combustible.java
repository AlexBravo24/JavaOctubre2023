package com;

public class Combustible {
	
	private String marca;
	private String tipo;
	private double tipocombustible;
	
	public Combustible() {}

	public Combustible(String marca, String tipo, double tipocombustible) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tipocombustible = tipocombustible;
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

	public double getTipocombustible() {
		return tipocombustible;
	}

	public void setTipocombustible(double tipocombustible) {
		this.tipocombustible = tipocombustible;
	}

	@Override
	public String toString() {
		return "Combustible [marca=" + marca + ", tipo=" + tipo + ", tipocombustible=" + tipocombustible + "]";
	}
	
	

}
