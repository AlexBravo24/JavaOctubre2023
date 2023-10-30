package com;

public class Aguila extends Animal {
	
	private String tipo;
	private String peso;
	private String color;
	private String genero;
	
	public Aguila() {}

	public Aguila(String habitat, String anatomia, String alimentacion, String tipo, String peso, String color,
			String genero) {
		super(habitat, anatomia, alimentacion);
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Aguila [tipo=" + tipo + ", peso=" + peso + ", color=" + color + ", genero=" + genero + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
