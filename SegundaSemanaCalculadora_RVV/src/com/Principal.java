package com;

public class Principal {

	public static void main(String[] args) {
		Cientifica calculadora = new Cientifica("casio", "roja", "cuadrada", "si");
		
		calculadora.sumar(2, 1);
        
        
        calculadora.restar(2, 4);
        
        
        double resultadoMultiplicacion = calculadora.multiplicar(4, 6);
        System.out.println("Multiplicaci�n: " + resultadoMultiplicacion);
        
        double resultadoDivision = calculadora.dividir(10, 2);
        System.out.println("Divisi�n: " + resultadoDivision);
        
        calculadora.tomartemperatura();
        calculadora.volar();
        calculadora.sound();

	}

}