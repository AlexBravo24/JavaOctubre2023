package com;

public class Playera extends Prenda {
	
	private String marca;
	private double precio;
	private String tipo;
	private String color;
	
	public Playera() {}

	public Playera(String nombre, String talla, String departamento, String marca, double precio, String tipo,
			String color) {
		super(nombre, talla, departamento);
		this.marca = marca;
		this.precio = precio;
		this.tipo = tipo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Playera [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	
	

}
