package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cientifica calculadora = new Cientifica ();
		
		//Probamos los métodos con una impresión directa en consola
		System.out.println("La suma es " + calculadora.sumar(10, 15));
		
		calculadora.tomarTemperatura();
		
		
	}

}
