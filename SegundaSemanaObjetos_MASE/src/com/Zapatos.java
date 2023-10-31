package com;

public class Zapatos {
	
	private String color;
	private int numero;
	private int modelo;
	
	public Zapatos () {}
	
	public Zapatos(String color, String textura, int numero, int modelo) {
		super();
		this.color = color;
		this.numero = numero;
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Zapatos [color=" + color + ", textura=" + ", numero=" + numero + ", modelo=" + modelo + "]";
	}
	
	

}
