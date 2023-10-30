package com;

public class Equipo {

	private String ciudad;
	private int fundacion;
	private String estadio;
	private String uniforme;
	private String entrenador;
	
	public Equipo() {}
	
	public Equipo(String ciudad, int fundacion, String estadio, String uniforme, String entrenador) {
		super();
		this.ciudad = ciudad;
		this.fundacion = fundacion;
		this.estadio = estadio;
		this.uniforme = uniforme;
		this.entrenador = entrenador;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getFundacion() {
		return fundacion;
	}
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public String getUniforme() {
		return uniforme;
	}
	public void setUniforme(String uniforme) {
		this.uniforme = uniforme;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	@Override
	public String toString() {
		return "Equipo [ciudad=" + ciudad + ", fundacion=" + fundacion + ", estadio=" + estadio + ", uniforme="
				+ uniforme + ", entrenador=" + entrenador + "]";
	}
}
