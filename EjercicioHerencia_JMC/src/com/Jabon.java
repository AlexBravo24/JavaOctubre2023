package com;

public class Jabon {
	
	private String nombre;
	private String marca;
	private String tipo;
	private String aroma;
	private int    precio;
	
public Jabon() {}

public Jabon(String nombre, String marca, String tipo, String aroma, int precio) {
	super();
	this.nombre = nombre;
	this.marca = marca;
	this.tipo = tipo;
	this.aroma = aroma;
	this.precio = precio;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getAroma() {
	return aroma;
}

public void setAroma(String aroma) {
	this.aroma = aroma;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

@Override
public String toString() {
	return "Jabon [nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", aroma=" + aroma + ", precio=" + precio
			+ "]";
}




	
}
