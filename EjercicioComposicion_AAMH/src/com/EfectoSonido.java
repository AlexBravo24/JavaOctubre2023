package com;

public class EfectoSonido {
	
	private String amplitud;
	private int frecuencia;
	private String sensación;
	
	public EfectoSonido () {}

	public EfectoSonido(String amplitud, int frecuencia, String sensación) {
		super();
		this.amplitud = amplitud;
		this.frecuencia = frecuencia;
		this.sensación = sensación;
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

	public String getSensación() {
		return sensación;
	}

	public void setSensación(String sensación) {
		this.sensación = sensación;
	}

	@Override
	public String toString() {
		return "EfectoSonido [amplitud=" + amplitud + ", frecuencia=" + frecuencia + ", sensación=" + sensación + "]";
	}
	
	

}
