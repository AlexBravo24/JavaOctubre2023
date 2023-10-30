package com;

public class Gato extends Animal {
	
	private String tama�o;
	private String visi�n;
	private String raza;
	private int domesticaci�n;
	
	public Gato () {}

	public Gato(String nombre, String especie, String tipo, String tama�o, String visi�n, String raza,
			int domesticaci�n) {
		super(nombre, especie, tipo);
		this.tama�o = tama�o;
		this.visi�n = visi�n;
		this.raza = raza;
		this.domesticaci�n = domesticaci�n;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getVisi�n() {
		return visi�n;
	}

	public void setVisi�n(String visi�n) {
		this.visi�n = visi�n;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getDomesticaci�n() {
		return domesticaci�n;
	}

	public void setDomesticaci�n(int domesticaci�n) {
		this.domesticaci�n = domesticaci�n;
	}

	@Override
	public String toString() {
		return "Gato [tama�o=" + tama�o + ", visi�n=" + visi�n + ", raza=" + raza + ", domesticaci�n=" + domesticaci�n
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
