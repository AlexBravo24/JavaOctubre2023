package com;

public class Estudiante extends Persona {

	private String grado;
	private String Carrera;
	private String escuela;
	private int matricula;
	
	public Estudiante() {}

	public Estudiante(String nombre, int edad, String genero, String grado, String carrera, String escuela,
			int matricula) {
		super(nombre, edad, genero);
		this.grado = grado;
		Carrera = carrera;
		this.escuela = escuela;
		this.matricula = matricula;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudiante [grado=" + grado + ", Carrera=" + Carrera + ", escuela=" + escuela + ", matricula="
				+ matricula + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getGenero()="
				+ getGenero() + "]";
	}

	
	
}
