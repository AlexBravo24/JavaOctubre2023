package com;

public class LavaManos {

	 private String marca;
	   private String material;
	   private int precio;
	   private String tama�o;


public LavaManos() {}


public LavaManos(String marca, String material, int precio, String tama�o) {
	super();
	this.marca = marca;
	this.material = material;
	this.precio = precio;
	this.tama�o = tama�o;
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


public String getTama�o() {
	return tama�o;
}


public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
}


@Override
public String toString() {
	return "LavaManos [marca=" + marca + ", material=" + material + ", precio=" + precio + ", tama�o=" + tama�o + "]";
}


}
