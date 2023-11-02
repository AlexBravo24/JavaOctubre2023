package com;

public class Snervioso {
	private String nombre;
	private String color;
	private String tamaño;
	
	public Snervioso(){
		
	}

	public Snervioso(String nombre, String color, String tamaño) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Snervioso [nombre=" + nombre + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
}
