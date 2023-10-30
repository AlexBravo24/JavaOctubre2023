package com;

public class Armas {
	private String tipo;
	private String elemento;
	private int ataque;
	private int defensa;
	private double velocidaddeataque;
	
	public Armas() {}

	public Armas(String tipo, String elemento, int ataque, int defensa, double velocidaddeataque) {
		super();
		this.tipo = tipo;
		this.elemento = elemento;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidaddeataque = velocidaddeataque;
	}

	@Override
	public String toString() {
		return "Armas [tipo=" + tipo + ", elemento=" + elemento + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", velocidaddeataque=" + velocidaddeataque + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
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

	public double getVelocidaddeataque() {
		return velocidaddeataque;
	}

	public void setVelocidaddeataque(double velocidaddeataque) {
		this.velocidaddeataque = velocidaddeataque;
	}
	
	
	
	
	
}
