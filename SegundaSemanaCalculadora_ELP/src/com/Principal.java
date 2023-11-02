package com;

//Clase principal

public class Principal {

	public static void main(String[] args) {
		
	Cientifica calculadora = new Cientifica();
	
	//Probamos los métodos con una impresion directa en consola
	System.out.println("La suma es: " + calculadora.sumar(10, 15));
	
	
	calculadora.tomarTemperatura();
	}

}
