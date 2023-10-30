package com;

public class Prota extends Parametros {
		
	private String genero;	
	private String especie;
	private String clase;	
	
	public Prota() {
		
	}

	public Prota(String nombre, double vida, double ataque, double defensa, String genero, String especie,
			String clase) {
		super(nombre, vida, ataque, defensa);
		this.genero = genero;
		this.especie = especie;
		this.clase = clase;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Prota [genero=" + genero + ", especie=" + especie + ", clase=" + clase + ", toString()="
				+ super.toString() + "]";
	}

}
