package com;

public class Ropa {
	
	
	private String color;
	private String talla;
	private int piezas;
	private int modelo;

	public Ropa () {}


	public Ropa(String color, String talla, int piezas, int modelo) {
		super();
		this.color = color;
		this.talla = talla;
		this.piezas = piezas;
		this.modelo = modelo;
	}




	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getPiezas() {
		return piezas;
	}

	public void setPiezas(int piezas) {
		this.piezas = piezas;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Ropa [color=" + color + ", talla=" + talla + ", piezas=" + piezas + ", modelo=" + modelo + "]";
	}
	
	
	
}
