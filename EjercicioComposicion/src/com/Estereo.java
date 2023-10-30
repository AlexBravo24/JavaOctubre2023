package com;

public class Estereo {

	private String marca; 
	private String color;
	
	public Estereo() {}

	public Estereo(String marca, String color) {
		super();
		this.marca = marca;
		this.color = color;
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

	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", color=" + color + "]";
	} 
	
	
	
	
}
