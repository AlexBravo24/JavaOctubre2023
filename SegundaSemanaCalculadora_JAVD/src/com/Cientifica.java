package com;

//Para implementar los métodos de una interface 
//lo hacemos con la palabra reservada "implements" y el nombre de
//la interface
public class Cientifica extends Calculadora implements ITermometro,IVolar {

	@Override
	public int suma(int a, int b) {
		int suma = a+b;
		return suma;
	}

	@Override
	public int resta(int a, int b) {
		int resta = a-b;
		return resta;
	}

	@Override
	public int multi(int a, int b) {
		int multi = a*b;
		return multi;
	}

	@Override
	public double div(double a, double b) {
		double div = a/b;
		return div;
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Tamando temperatura = normal 36°C");
		
	}

	@Override
	public void volar() {
		System.out.println("Volando");
		
	}

	@Override
	public void sound() {
		System.out.println("Pip");
		
	}
	
	//¿Existe la multiherencia en Java?
	//No. Pero puede ser simulada mediante el uso de interfaces
	
	//¿De dónde toman u obtienen comportamientos los objetos?
	//1. Métodos propios
	//2. De otras clases (Clases padre), ya sean abstractas o no
	//3. Interfaces

}
