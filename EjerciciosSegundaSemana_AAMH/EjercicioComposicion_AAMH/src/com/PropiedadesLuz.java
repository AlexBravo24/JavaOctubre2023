package com;

public class PropiedadesLuz {
	
	private int longitud;
	private int intensidad;
	private String reflexión;
	
	public PropiedadesLuz() {}

	public PropiedadesLuz(int longitud, int intensidad, String reflexión) {
		super();
		this.longitud = longitud;
		this.intensidad = intensidad;
		this.reflexión = reflexión;
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

	public String getReflexión() {
		return reflexión;
	}

	public void setReflexión(String reflexión) {
		this.reflexión = reflexión;
	}

	@Override
	public String toString() {
		return "PropiedadesLuz [longitud=" + longitud + ", intensidad=" + intensidad + ", reflexión=" + reflexión + "]";
	}
	
	
	

}
