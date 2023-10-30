package com;

public class Neumatico {

	private String marca;
	private String tama�o;
	private String traccion;
	
	public Neumatico() {}

	public Neumatico(String marca, String tama�o, String traccion) {
		super();
		this.marca = marca;
		this.tama�o = tama�o;
		this.traccion = traccion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	@Override
	public String toString() {
		return "Neumatico [marca=" + marca + ", tama�o=" + tama�o + ", traccion=" + traccion + "]";
	}
	
	
	
}
