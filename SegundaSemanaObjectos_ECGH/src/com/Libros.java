package com;

public class Libros {
	private String nombre;
	private String editorial;
	private String g�nero;
	private int paginas;
	private int precio;
	private String empastado;
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getEmpastado() {
		return empastado;
	}
	public void setEmpastado(String empastado) {
		this.empastado = empastado;
	}
	
	public Libros(){
		
		
	}
	
	
	
	public Libros(String nombre, String editorial, String g�nero, int paginas, int precio, String empastado) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.g�nero = g�nero;
		this.paginas = paginas;
		this.precio = precio;
		this.empastado = empastado;
	}
	
	
	
	@Override
	public String toString() {
		return "Libros [nombre=" + nombre + ", editorial=" + editorial + ", g�nero=" + g�nero + ", paginas=" + paginas
				+ ", precio=" + precio + ", empastado=" + empastado + "]";
	}
	
	
	
	
	
	

}
