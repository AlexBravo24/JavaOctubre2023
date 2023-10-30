package com;

public class Personaje {
	
	private String nombre;
	private String colorpelo;
	private double altura;
	private String raza;
	private String habilidadraza;
	private String armapreferida;
	
	public Personaje() {}

	public Personaje(String nombre, String colorpelo, double altura, String raza, String habilidadraza,
			String armapreferida) {
		super();
		this.nombre = nombre;
		this.colorpelo = colorpelo;
		this.altura = altura;
		this.raza = raza;
		this.habilidadraza = habilidadraza;
		this.armapreferida = armapreferida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColorpelo() {
		return colorpelo;
	}

	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getHabilidadraza() {
		return habilidadraza;
	}

	public void setHabilidadraza(String habilidadraza) {
		this.habilidadraza = habilidadraza;
	}

	public String getArmapreferida() {
		return armapreferida;
	}

	public void setArmapreferida(String armapreferida) {
		this.armapreferida = armapreferida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", colorpelo=" + colorpelo + ", altura=" + altura + ", raza=" + raza
				+ ", habilidadraza=" + habilidadraza + ", armapreferida=" + armapreferida + "]";
	}
	
	

}
