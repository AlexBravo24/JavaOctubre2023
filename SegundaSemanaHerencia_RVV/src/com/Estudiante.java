package com;

public class Estudiante extends Persona{
	
	private String carrera;
	private String grado;
	private int matricula;
	private String escuela;
	
	public Estudiante() {}

	public Estudiante(String nombre, int edad, String genero, String carrera, String grado, int matricula,
			String escuela) {
		super(nombre, edad, genero);
		this.carrera = carrera;
		this.grado = grado;
		this.matricula = matricula;
		this.escuela = escuela;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", grado=" + grado + ", matricula=" + matricula + ", escuela="
				+ escuela + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("estoy durmiendo en clase");
	}
	

}
