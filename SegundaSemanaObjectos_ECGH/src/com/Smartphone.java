package com;

public class Smartphone {
	
	private String marca;
	private String modelo;
	private int año;
	private String procesador;
	private String pantalla;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getPantalla() {
		return pantalla;
	}
	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	
	
	public Smartphone() {
		
	}
	
	
	
	
	public Smartphone(String marca, String modelo, int año, String procesador, String pantalla) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.procesador = procesador;
		this.pantalla = pantalla;
	}
	
	
	
	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", procesador=" + procesador
				+ ", pantalla=" + pantalla + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
