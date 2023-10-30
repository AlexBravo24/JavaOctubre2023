package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {
	
	Scanner entrada = new Scanner(System.in);
	
	private double suma;
	private double resta;
	private double multiplicacion;
	private double division;
	
	
	public void Cientifica() {}

	public Cientifica(String color, String marca, String fuenteDeEnergia) {
		super(color, marca, fuenteDeEnergia);
	}
	
	
	@Override
	public void  sumar() {
		
		System.out.println("Ingresa un numero");
		double numero1= entrada.nextDouble();
		
		System.out.println("Ingresa otro numero");
		double numero2= entrada.nextDouble();
		
		
		suma=numero1+numero2;
		
		System.out.println("El resultado es: " + suma);
		
	
	}
	@Override
	public void restar() {
		System.out.println("Ingresa un numero");
		double numero1= entrada.nextDouble();
		
		System.out.println("Ingresa otro numero");
		double numero2= entrada.nextDouble();
		
		
		resta=numero1-numero2;
		
		System.out.println("El resultado es: " + resta);
		
	}
	@Override
	public void multiplicar() {
		System.out.println("Ingresa un numero");
		double numero1= entrada.nextDouble();
		
		System.out.println("Ingresa otro numero");
		double numero2= entrada.nextDouble();
		
		
		multiplicacion=numero1*numero2;
		
		System.out.println("El resultado es: " + multiplicacion);
	}
	@Override
	public void dividir() {
		System.out.println("Ingresa un numero");
		double numero1= entrada.nextDouble();
		
		System.out.println("Ingresa otro numero");
		double numero2= entrada.nextDouble();
		
		
		division=numero1/numero2;
		
		System.out.println("El resultado es: " + division);
	}
	
	
	
	
	
	

}
