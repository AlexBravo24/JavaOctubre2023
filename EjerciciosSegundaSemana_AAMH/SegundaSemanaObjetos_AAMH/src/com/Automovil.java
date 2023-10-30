package com;

public class Automovil {
	
	
	//Variables de clase
	private String marca;
    private int modelo;
	private String color;
	private int velocidadMaxima;

	//Constructores
	public Automovil () {}

	public Automovil(String marca, int modelo, String color, int velocidadMaxima) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}
	
	
	
}
