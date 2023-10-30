package com;

public class Estudiante extends Persona {

     private String licenciatura;
     private String matricula;
     private String carrera;
     private String escuela;

     
     public Estudiante() {}


	public Estudiante(String nombre, int edad, String genero, String licenciatura, String matricula, String carrera,
			String escuela) {
		super(nombre, edad, genero);
		this.licenciatura = licenciatura;
		this.matricula = matricula;
		this.carrera = carrera;
		this.escuela = escuela;
	}


	public String getLicenciatura() {
		return licenciatura;
	}


	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	public String getEscuela() {
		return escuela;
	}


	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}


	@Override
	public String toString() {
		return "Estudiante [licenciatura=" + licenciatura + ", matricula=" + matricula + ", carrera=" + carrera
				+ ", escuela=" + escuela + ", toString()=" + super.toString() + "]";
	}


	@Override
	public void dormir() {
		System.out.println("durmiendo en clase siempre");
		
	}

	@Override
	public void caminar() {
	
		
	}
     
     
}
