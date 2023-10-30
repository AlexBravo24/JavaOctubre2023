package com;

public class Esencia {
	
	private String aroma;
	private int tamaño;
	private double precio;
	private String descripcion;
	private double peso;
	
	
	 
 public Esencia() {
	 
 }
	public Esencia(String aroma, int tamaño, double precio, String descripcion, double peso) {
		super();
		this.aroma = aroma;
		this.tamaño = tamaño;
		this.precio = precio;
		this.descripcion = descripcion;
		this.peso = peso;
	}

	public String getAroma() {
		return aroma;
	}
	public void setAroma(String aroma) {
		this.aroma = aroma;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Esencias [aroma=" + aroma + ", tamaño=" + tamaño + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
	

}
