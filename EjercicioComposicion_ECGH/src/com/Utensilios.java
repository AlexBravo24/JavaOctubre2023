package com;

public class Utensilios {
	
	private String nombre;
	private String color;
	private String material;
	
	
	public Utensilios(){}
	
	public Utensilios(String nombre, String color, String material) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.material = material;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Utensilios [nombre=" + nombre + ", color=" + color + ", material=" + material + "]";
	}
	

	
	

}
