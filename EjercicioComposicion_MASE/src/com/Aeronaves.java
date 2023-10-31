package com;

public class Aeronaves {
	
	private String tipo;
	private String marca;
	private String aerolinea;
	
	
	private Combustible tipC;
	private Motor tipMot;
	private Pasajeros numPas;
	
	public Aeronaves() {}

	public Aeronaves(String tipo, String marca, String aerolinea, Combustible tipC, Motor tipMot, Pasajeros numPas) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.aerolinea = aerolinea;
		this.tipC = tipC;
		this.tipMot = tipMot;
		this.numPas = numPas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Combustible getTipC() {
		return tipC;
	}

	public void setTipC(Combustible tipC) {
		this.tipC = tipC;
	}

	public Motor getTipMot() {
		return tipMot;
	}

	public void setTipMot(Motor tipMot) {
		this.tipMot = tipMot;
	}

	public Pasajeros getNumPas() {
		return numPas;
	}

	public void setNumPas(Pasajeros numPas) {
		this.numPas = numPas;
	}

	@Override
	public String toString() {
		return "Aeronaves [tipo=" + tipo + ", marca=" + marca + ", aerolinea=" + aerolinea + ", tipC=" + tipC
				+ ", tipMot=" + tipMot + ", numPas=" + numPas + "]";
	}
	
	

}
