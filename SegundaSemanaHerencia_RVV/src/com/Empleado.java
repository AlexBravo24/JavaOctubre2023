package com;

//la herencia se realiza con la palabra reservada
//extends despues del nombre de la clase

public class Empleado extends Persona {
	
	//atributos propios de un empleado
	
	private String rfc;
	private double salario;
	private String cargo;
	
	
	public Empleado() {}

	//creamos un construtctor con todos los parametros, pero
	//elegimos tambien el constructor de la clase padre
	//que es persona
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

	//las clases hijas deben definir como se va a hacer
	//el metodo abstracto que se declaro en su clase padre
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("estoy durmiendo en el vestidor");
	}


	
}
