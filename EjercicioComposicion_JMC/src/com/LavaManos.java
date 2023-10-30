package com;

public class LavaManos {

	 private String marca;
	   private String material;
	   private int precio;
	   private String tamaño;


public LavaManos() {}


public LavaManos(String marca, String material, int precio, String tamaño) {
	super();
	this.marca = marca;
	this.material = material;
	this.precio = precio;
	this.tamaño = tamaño;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getMaterial() {
	return material;
}


public void setMaterial(String material) {
	this.material = material;
}


public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


public String getTamaño() {
	return tamaño;
}


public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}


@Override
public String toString() {
	return "LavaManos [marca=" + marca + ", material=" + material + ", precio=" + precio + ", tamaño=" + tamaño + "]";
}


}
