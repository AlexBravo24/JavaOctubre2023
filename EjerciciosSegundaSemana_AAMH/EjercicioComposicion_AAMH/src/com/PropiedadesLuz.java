package com;

public class PropiedadesLuz {
	
	private int longitud;
	private int intensidad;
	private String reflexi�n;
	
	public PropiedadesLuz() {}

	public PropiedadesLuz(int longitud, int intensidad, String reflexi�n) {
		super();
		this.longitud = longitud;
		this.intensidad = intensidad;
		this.reflexi�n = reflexi�n;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}

	public String getReflexi�n() {
		return reflexi�n;
	}

	public void setReflexi�n(String reflexi�n) {
		this.reflexi�n = reflexi�n;
	}

	@Override
	public String toString() {
		return "PropiedadesLuz [longitud=" + longitud + ", intensidad=" + intensidad + ", reflexi�n=" + reflexi�n + "]";
	}
	
	
	

}
