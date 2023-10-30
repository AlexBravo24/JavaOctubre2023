package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calculadora = new Cientifica();
		System.out.println("El resultado es: " + calculadora.suma(10, 5));
		System.out.println("El resultado es: " + calculadora.resta(10, 5));
		System.out.println("El resultado es: " + calculadora.multiplicacion(10, 5));
		System.out.println("El resultado es: " + calculadora.division(10, 5));

	}

}
