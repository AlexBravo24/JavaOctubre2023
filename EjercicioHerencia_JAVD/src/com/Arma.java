package com;

public class Arma extends Parametros {
	
	private String tipo;
	private String color;
	private String material;
	
	public Arma() {
		
	}

	public Arma(String nombre, double resistencia, double ataque, double defensa, String tipo, String color,
			String material) {
		super(nombre, resistencia, ataque, defensa);
		this.tipo = tipo;
		this.color = color;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", color=" + color + ", material=" + material + ", toString()="
				+ super.toString() + "]";
	}
	
}
