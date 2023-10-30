package com;

public class Personaje {

	private String nombre, habilidad;
	private int ataque, defensa;
	
	public Personaje() {
		
	}
	
	public Personaje(String nombre, String habilidad, int ataque, int defensa) {
		super();
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
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
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", habilidad=" + habilidad + ", ataque=" + ataque + ", defensa="
				+ defensa + "]";
	}		
	
}
