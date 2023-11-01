package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	private String fuenteDeEnergia;
	
	
	public Calculadora() {}
	
	public Calculadora(String marca, String color, String fuenteDeEnergia) {
		super();
		this.marca = marca;
		this.color = color;
		this.fuenteDeEnergia = fuenteDeEnergia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuenteDeEnergia() {
		return fuenteDeEnergia;
	}
	public void setFuenteDeEnergia(String fuenteDeEnergia) {
		this.fuenteDeEnergia = fuenteDeEnergia;
	}
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", fuenteDeEnergia=" + fuenteDeEnergia + "]";
	}

	
	public abstract double suma(double a,double b);
	public abstract double resta(double a,double b);
	public abstract double multiplicacion(double a,double b);
	public abstract double division(double a,double b);
}
