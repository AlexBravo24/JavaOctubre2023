package com;

public class Libros {
	private String nombre;
	private String editorial;
	private String género;
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
	public String getGénero() {
		return género;
	}
	public void setGénero(String género) {
		this.género = género;
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
	
	
	
	public Libros(String nombre, String editorial, String género, int paginas, int precio, String empastado) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.género = género;
		this.paginas = paginas;
		this.precio = precio;
		this.empastado = empastado;
	}
	
	
	
	@Override
	public String toString() {
		return "Libros [nombre=" + nombre + ", editorial=" + editorial + ", género=" + género + ", paginas=" + paginas
				+ ", precio=" + precio + ", empastado=" + empastado + "]";
	}
	
	
	
	
	
	

}
