package com;

//La HERENCIA, se resliza con la palabra reservada
//"extends" despu�s del nombre de la clase
public class Empleado extends Persona  {
	
	//Atributos propios de un empleado
	private String rfc;
	private double salario;
	private String cargo;
	
	public Empleado() {
		
	}
	
	//Creamos un constructor con todos los par�metros, pero
	//elegimos tambi�n el constructor de la clase padre
	//que es Persona
	
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
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", cargo=" + cargo + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", getGenero()=" + getGenero() + "]";
	}

	
	//Las clases hijas deben definir C�MO se va a hacer
	//el m�todo abstracto que se declaro en su clase padre
	
	@Override
	public void dormir() {
		
		System.out.println("Estoy durmiendo en el vestidor");
		
	}

	

}
