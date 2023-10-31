package com;

//La herencia se realiza con la palabra reservada extends despues del nombre de la clase
public class Empleado extends Persona {
	
	//Atributos propios de un empleado
	
	private String RFC;
	private String salario;
	private String puesto;

	
	public Empleado() {}

//Creamos un constructor con todods los parametros y elegimos tambien un constructor de la clase padre que es persona
	
	public Empleado(String nombre, int edad, String genero, String rFC, String salario, String puesto) {
		super(nombre, edad, genero);
		RFC = rFC;
		this.salario = salario;
		this.puesto = puesto;
	}


	public String getRFC() {
		return RFC;
	}


	public void setRFC(String rFC) {
		RFC = rFC;
	}


	public String getSalario() {
		return salario;
	}


	public void setSalario(String salario) {
		this.salario = salario;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [RFC=" + RFC + ", salario=" + salario + ", puesto=" + puesto + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
