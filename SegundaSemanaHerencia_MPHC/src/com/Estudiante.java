package com;

public class Estudiante extends Persona {
	
	private String carrera;
	private String grado;
	private int matriculo;
	private String escuela;
	
	
	
	public Estudiante() {}
	
	public Estudiante(String nombre, int edad, String genero, String carrera, String grado, int matriculo,
			String escuela) {
		super(nombre, edad, genero);
		this.carrera = carrera;
		this.grado = grado;
		this.matriculo = matriculo;
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
	public int getMatriculo() {
		return matriculo;
	}
	public void setMatriculo(int matriculo) {
		this.matriculo = matriculo;
	}
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", grado=" + grado + ", matriculo=" + matriculo + ", escuela="
				+ escuela + ", toString()=" + super.toString() + "]";
	}

	//Las clases hijas van a definir  COMo se va hacer
		//el metodo abstracto que se declaro en su clase padre
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
		System.out.println("Estoy durmiendo en clase");
		
	}
	
	
	
	

}
