package com;

public class Rin {

	private String marca;
	private int diametro;
	private double ancho;
	private String color;
	
	public Rin() {}
	

	public Rin(String marca, int diametro, double ancho, String color) {
		super();
		this.marca = marca;
		this.diametro = diametro;
		this.ancho = ancho;
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getDiametro() {
		return diametro;
	}


	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Rin [marca=" + marca + ", diametro=" + diametro + ", ancho=" + ancho + ", color=" + color + "]";
	}
	
	
	
}
