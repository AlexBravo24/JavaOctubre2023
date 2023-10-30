package com;

//La HERENCIA, se realiza con la palabra reservada
//"extends" despues del nombre de a clase
public class Empleado extends Persona {

	//Atributos propios de un empleado
	
	private String rfc;
	private double salario;
	private String cargo;
	
	public Empleado () {}
	
	//Creamos un cosntrucctor con todos los parametros, pero
	//elegimos también el constructor de la clase padre
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
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", cargo=" + cargo + ", toString()=" + super.toString()
				+ "]";
	}

	//Las clases hijas deben definir CÓMO se va a hacer
	//el método abstracto que se declaro en su clase padre
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Estoy durmiendo en el vestidor");
	}
	
	
	
	
	
}
