package com;

public class Personaje {
	
	private String nombre;
	private int ataque;
	private int defensa;
	private String habilidad;
	
	public Personaje() {}

	public Personaje(String nombre, int ataque, int defensa, String habilidad) {
		super();
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.habilidad = habilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", habilidad="
				+ habilidad + "]";
	}
	

}