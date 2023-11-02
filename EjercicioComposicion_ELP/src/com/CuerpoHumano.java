package com;

public class CuerpoHumano {

	private String nombre;
	private int edad;
	private char sexo;
	
	//Vamos a crear estos atributos como objetos
	//que también van a formar parte de nuestra computadora
	
	private Sdigestivo boca;
	private Snervioso central  ;
	private Soseo craneo;
	
	
	public CuerpoHumano(){
		
	}

	public CuerpoHumano(String nombre, int edad, char sexo, Sdigestivo boca, Snervioso central, Soseo craneo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.boca = boca;
		this.central = central;
		this.craneo = craneo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Sdigestivo getBoca() {
		return boca;
	}

	public void setBoca(Sdigestivo boca) {
		this.boca = boca;
	}

	public Snervioso getCentral() {
		return central;
	}

	public void setCentral(Snervioso central) {
		this.central = central;
	}

	public Soseo getCraneo() {
		return craneo;
	}

	public void setCraneo(Soseo craneo) {
		this.craneo = craneo;
	}

	@Override
	public String toString() {
		return "CuerpoHumano [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", boca=" + boca + ", central="
				+ central + ", craneo=" + craneo + "]";
	}
	
}
