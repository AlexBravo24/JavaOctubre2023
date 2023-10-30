package com;

public abstract class Calculadora {

	private String color;
	private String marca;
	private String modelo;
	
	public Calculadora() {}

	public Calculadora(String color, String marca, String modelo) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public abstract void sumar(double num1, double num2);
	
	public abstract void restar(double num1, double num2);
	
	public abstract void multiplicar(double num1, double num2);
	
	public abstract void dividir(double num1, double num2);
	
	
	
}
