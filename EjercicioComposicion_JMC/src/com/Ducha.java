package com;

public class Ducha {
	
	private String marca;
	private int descargaAgua;
	private  int precio;
	
	
	public Ducha() {}


	public Ducha(String marca, int descargaAgua, int precio) {
		super();
		this.marca = marca;
		this.descargaAgua = descargaAgua;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getDescargaAgua() {
		return descargaAgua;
	}


	public void setDescargaAgua(int descargaAgua) {
		this.descargaAgua = descargaAgua;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Ducha [marca=" + marca + ", descargaAgua=" + descargaAgua + ", precio=" + precio + "]";
	}
	
	
	

}
