package com;

public class Pelicula {
	
	private String titulo;
	private String descripcion;
	private String genero;
	private double precio;
	private String resolucion;
	
	
	
	public Pelicula() {}



	public Pelicula(String titulo, String descripcion, String genero, double precio, String resolucion) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.genero = genero;
		this.precio = precio;
		this.resolucion = resolucion;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getResolucion() {
		return resolucion;
	}



	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}



	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", descripcion=" + descripcion + ", genero=" + genero + ", precio="
				+ precio + ", resolucion=" + resolucion + "]";
	}
	
	
	
	

}
