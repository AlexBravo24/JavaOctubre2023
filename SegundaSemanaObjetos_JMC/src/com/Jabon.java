package com;

public class Jabon {
	
	
	
	private String aroma ;
	private int cantidadKgL;
	private String color;
	private String tipo;
	private String marca;
	private float precio;
	
	public Jabon() {}

	public Jabon(String aroma, int cantidadKgL, String color, String tipo, String marca, float precio) {
		super();
		this.aroma = aroma;
		this.cantidadKgL = cantidadKgL;
		this.color = color;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public int getCantidadKgL() {
		return cantidadKgL;
	}

	public void setCantidadKgL(int cantidadKgL) {
		this.cantidadKgL = cantidadKgL;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Jabon [aroma=" + aroma + ", cantidadKgL=" + cantidadKgL + ", color=" + color + ", tipo=" + tipo
				+ ", marca=" + marca + ", precio=" + precio + "]";
	}
  	
	
	

	
	
	
	
	
}
