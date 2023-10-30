package com;

public class Retrete {

   private int descargaLitros;
   private String Marca;
   private String tipo;
   private int precio;
   
   
   public Retrete() {}


public Retrete(int descargaLitros, String marca, String tipo, int precio) {
	super();
	this.descargaLitros = descargaLitros;
	Marca = marca;
	this.tipo = tipo;
	this.precio = precio;
}


public int getDescargaLitros() {
	return descargaLitros;
}


public void setDescargaLitros(int descargaLitros) {
	this.descargaLitros = descargaLitros;
}


public String getMarca() {
	return Marca;
}


public void setMarca(String marca) {
	Marca = marca;
}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Retrete [descargaLitros=" + descargaLitros + ", Marca=" + Marca + ", tipo=" + tipo + ", precio=" + precio
			+ "]";
}
   
   
   
   
   
	
}
