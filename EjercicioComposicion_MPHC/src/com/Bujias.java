package com;

public class Bujias {
	
	private String marca;
	private int cantidad;
	private String tipo;
	
	public Bujias() {}

	public Bujias(String marca, int cantidad, String tipo) {
		super();
		this.marca = marca;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Bujias [marca=" + marca + ", cantidad=" + cantidad + ", tipo=" + tipo + "]";
	}



	
	

}
