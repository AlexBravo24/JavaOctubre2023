package com;

public abstract class Calculadora {
	
	private String color;
	private String marca;
	private String fuenteDeEnergia;
	public Calculadora(String color, String marca, String fuenteDeEnergia) {
		super();
		this.color = color;
		this.marca = marca;
		this.fuenteDeEnergia = fuenteDeEnergia;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFuenteDeEnergia() {
		return fuenteDeEnergia;
	}
	public void setFuenteDeEnergia(String fuenteDeEnergia) {
		this.fuenteDeEnergia = fuenteDeEnergia;
	}
	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", fuenteDeEnergia=" + fuenteDeEnergia + "]";
	}
	
	
	
	public abstract void sumar();
	
	public abstract void restar();
	
	public abstract void multiplicar();
	
	public abstract void dividir();
	

}
