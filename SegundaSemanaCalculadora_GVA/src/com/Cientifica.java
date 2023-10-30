package com;

//Para implementar los métodos de una interface
//lo hacemos con la palabra reservada "implements" y el nombre de
//la interface
public class Cientifica extends Calculadora implements ITermometro, IVolar {

	private double sumar;
	private double restar;
	private double multiplicar;
	private double dividir;
	
	public Cientifica() {}

	public Cientifica(String color, String marca, String modelo, double sumar, double restar, double multiplicar,
			double dividir) {
		super(color, marca, modelo);
		this.sumar = sumar;
		this.restar = restar;
		this.multiplicar = multiplicar;
		this.dividir = dividir;
	}

	public double getSumar() {
		return sumar;
	}

	public void setSumar(double sumar) {
		this.sumar = sumar;
	}

	public double getRestar() {
		return restar;
	}

	public void setRestar(double restar) {
		this.restar = restar;
	}

	public double getMultiplicar() {
		return multiplicar;
	}

	public void setMultiplicar(double multiplicar) {
		this.multiplicar = multiplicar;
	}

	public double getDividir() {
		return dividir;
	}

	public void setDividir(double dividir) {
		this.dividir = dividir;
	}

	@Override
	public String toString() {
		return "Cientifica [sumar=" + sumar + ", restar=" + restar + ", multiplicar=" + multiplicar + ", dividir="
				+ dividir + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar(double num1, double num2) {
		sumar = num1 + num2;
		System.out.println("La suma es " + sumar);
		
	}

	@Override
	public void restar(double num1, double num2) {
		restar = num1 - num2;
		System.out.println("La resta es: " + restar);
		
	}

	@Override
	public void multiplicar(double num1, double num2) {
		multiplicar = num1 * num2;
		System.out.println("La multiplicación es: " + multiplicar);
		
	}

	@Override
	public void dividir(double num1, double num2) {
		dividir = num1/num2;
		System.out.println("La división es: " + dividir);
			
		}

	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando temperatura = normal 36°C");
		
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
	//¿Existe la multiherencia en Java?
	//No. Pero puede ser simulada mediante el uso de interfaces.
	
	//¿De dónde toman u obtienen comportamientos los objetos?
	//1. Métodos propios
	//2. De otras clases (clases padre), ya sean abstractas o no.
	//3. Interfaces
	
	
}
