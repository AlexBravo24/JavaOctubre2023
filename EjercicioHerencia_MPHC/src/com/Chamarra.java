package com;

public class Chamarra extends Prenda {
	
	private String marca;
	private String color;
	private String material;
	private double precio;
	
	
	public Chamarra() {}


	public Chamarra(String nombre, String talla, String departamento, String marca, String color, String material,
			double precio) {
		super(nombre, talla, departamento);
		this.marca = marca;
		this.color = color;
		this.material = material;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Chamarra [marca=" + marca + ", color=" + color + ", material=" + material + ", precio=" + precio
				+ ", toString()=" + super.toString() + "]";
	}
	
	


	


	
	
	
	

}
