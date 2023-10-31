package com;

public class Empleado extends Persona {

	//la HERENCIA , se realiza con la palabra reservada 
	//"extends" despues del nombre de la clase
	//Atributos propios de un empleado
	
	
		
	
	
	
	private String rfc;
	private double salario;
	private String cargo;
	
	public Empleado () {}

	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String cargo) {
		super(nombre, edad, genero);
		this.rfc = rfc;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", cargo=" + cargo + ", toString()=" + super.toString()
				+ "]";
	}

}
	
	
	
	
