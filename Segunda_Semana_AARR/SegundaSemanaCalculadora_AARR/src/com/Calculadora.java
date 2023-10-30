package com;

public abstract class Calculadora {
	
	private String marca;
	private String modelo;
	private String color;
	private int peso;
	
	public Calculadora()
	{
		
	}

	public Calculadora(String marca, String modelo, String color, int peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.peso = peso;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", peso=" + peso + "]";
	}
	
	public abstract void suma();
	
	public abstract void restar();
	
	public abstract void multiplicar();
	
	public abstract void dividir();
	
	
}
