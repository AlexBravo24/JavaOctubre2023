package com;

public class EfectoSonido {
	
	private String amplitud;
	private int frecuencia;
	private String sensaci�n;
	
	public EfectoSonido () {}

	public EfectoSonido(String amplitud, int frecuencia, String sensaci�n) {
		super();
		this.amplitud = amplitud;
		this.frecuencia = frecuencia;
		this.sensaci�n = sensaci�n;
	}

	public String getAmplitud() {
		return amplitud;
	}

	public void setAmplitud(String amplitud) {
		this.amplitud = amplitud;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getSensaci�n() {
		return sensaci�n;
	}

	public void setSensaci�n(String sensaci�n) {
		this.sensaci�n = sensaci�n;
	}

	@Override
	public String toString() {
		return "EfectoSonido [amplitud=" + amplitud + ", frecuencia=" + frecuencia + ", sensaci�n=" + sensaci�n + "]";
	}
	
	

}
