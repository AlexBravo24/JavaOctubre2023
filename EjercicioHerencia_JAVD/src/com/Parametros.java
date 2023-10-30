package com;

public class Parametros {
	
	private String nombre;
	private double resistencia;
	private double ataque;
	private double defensa;
	
	public Parametros() {
		
	}

	public Parametros(String nombre, double resistencia, double ataque, double defensa) {
		super();
		this.nombre = nombre;
		this.resistencia = resistencia;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getresistencia() {
		return resistencia;
	}

	public void setresistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	@Override
	public String toString() {
		return "Parametros [nombre=" + nombre + ", resistencia=" + resistencia + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	
}