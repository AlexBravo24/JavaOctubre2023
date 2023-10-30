package com;

public class Perro extends Animal{
	
	private String raza;
	private String color;
	private String tama�o;
	
	public Perro() {}

	public Perro(String nombre, String especie, String tipo, String raza, String color, String tama�o) {
		super(nombre, especie, tipo);
		this.raza = raza;
		this.color = color;
		this.tama�o = tama�o;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", tama�o=" + tama�o + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	

}
