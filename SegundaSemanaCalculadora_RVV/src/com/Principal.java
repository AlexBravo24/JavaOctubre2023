package com;

public class Principal {

	public static void main(String[] args) {
		Cientifica calculadora = new Cientifica("casio", "roja", "cuadrada", "si");
		
		calculadora.sumar(2, 1);
        
        
        calculadora.restar(2, 4);
        
        
        double resultadoMultiplicacion = calculadora.multiplicar(4, 6);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        
        double resultadoDivision = calculadora.dividir(10, 2);
        System.out.println("División: " + resultadoDivision);
        
        calculadora.tomartemperatura();
        calculadora.volar();
        calculadora.sound();

	}

}
