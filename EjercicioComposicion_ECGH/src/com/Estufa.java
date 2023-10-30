package com;

public class Estufa {
	private String color;
	private String numeroHornillas;
	private String marca;
	
	public Estufa() {}

	public Estufa(String color, String numeroHornillas, String marca) {
		super();
		this.color = color;
		this.numeroHornillas = numeroHornillas;
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumeroHornillas() {
		return numeroHornillas;
	}

	public void setNumeroHornillas(String numeroHornillas) {
		this.numeroHornillas = numeroHornillas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Estufa [color=" + color + ", numeroHornillas=" + numeroHornillas + ", marca=" + marca + "]";
	}
	
	
	
	
	
	

}
