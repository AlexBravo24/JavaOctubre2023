package com;

public class Tiburon extends Animal {
	
	private String tipo;
	private double peso;
	private String color;
	
	public Tiburon() {}

	public Tiburon(String habitat, String anatomia, String alimentacion, String tipo, double peso, String color) {
		super(habitat, anatomia, alimentacion);
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tiburon [tipo=" + tipo + ", peso=" + peso + ", color=" + color + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
