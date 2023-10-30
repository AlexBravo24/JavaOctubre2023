package com;

public class Alacena {
	private String color;
	private String material;
	private String tamaño;
	
	public Alacena() {}

	public Alacena(String color, String material, String tamaño) {
		super();
		this.color = color;
		this.material = material;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Alacena [color=" + color + ", material=" + material + ", tamaño=" + tamaño + "]";
	}
	
	
	

}
