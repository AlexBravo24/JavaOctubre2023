package com;
//Clase hija

//La HERENCIA, se realiza con la palabra reservada
//"extends" despues del nombre de la clase
public class Perro extends Animal {
	
//Atributos propios de un empleado
	
	private String raza;
	private int edad;
	private String color;

//Constructor vacío con todo sus parametros
	public Perro() {	
	}
	
//Creamos un constructor con todos los
//parametros, pero elegimos también el
//constructor de la clase padre
//que es Animal
	
public Perro(String nombre, String especie, String tipo, String raza, int edad, String color) {
	super(nombre, especie, tipo);
	this.raza = raza;
	this.edad = edad;
	this.color = color;
}

//Los getters y setters quedan seleccionados todos,
//No hay cambios en esta parte
//Atributos de la clase hija perro

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

//Generar el metodo String
@Override
public String toString() {
	return "Perro [raza=" + raza + ", edad=" + edad + ", color=" + color + ", toString()=" + super.toString() + "]";
}




	
}
