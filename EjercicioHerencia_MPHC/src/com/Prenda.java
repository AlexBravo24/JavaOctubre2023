package com;

public class Prenda {
	
	private String nombre;
	private String talla;
	private String departamento;
	
	
	public Prenda() {}


	public Prenda(String nombre, String talla, String departamento) {
		super();
		this.nombre = nombre;
		this.talla = talla;
		this.departamento = departamento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getdepartamento() {
		return departamento;
	}


	public void setdepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Prenda [nombre=" + nombre + ", talla=" + talla + ", departamento=" + departamento + "]";
	}
	
	
	

	
	
	
	
	

}
