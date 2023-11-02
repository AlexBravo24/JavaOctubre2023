package com;

public class Celular {
	
	//Declaracion de variables	
	String marca;
	String color;
	String sistema_operativo;
	
	//Metodos constructores
	
	public Celular() {
		
	}

	public Celular(String marca, String color, String sistema_operativo) {
		super();
		this.marca = marca;
		this.color = color;
		this.sistema_operativo = sistema_operativo;
	}

	//getters y setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSistema_operativo() {
		return sistema_operativo;
	}

	public void setSistema_operativo(String sistema_operativo) {
		this.sistema_operativo = sistema_operativo;
	}

	//Crean el método toString()
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", sistema_operativo=" + sistema_operativo + "]";
	}
	
	

}
