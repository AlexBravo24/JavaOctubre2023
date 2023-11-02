package com;

//Para implementar los métodos de una interface
//lo hacemos con la palabra reservada "implements" y el nombre de
//la interface
public class Cientifica extends Calculadora implements ITermometro, IVolar{
	
	//Hereda sus atributos 

	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double dividir(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando temperatura = normal 36°C");
		
		
	}

	@Override
	public void volar() {
		
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
	//¿Existe la multiherencia en Java?
	//No. Pero puede ser simulada mediante el uso de interface
	
	//¿De donde toman u obtienen comportamientos los objetos?
	//1. Métodos propios
	//2. De otras clases
	//3. Interfaces
	
}
