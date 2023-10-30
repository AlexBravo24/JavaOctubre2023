package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda 
		//Son expresiones o funciones an�nimas 
		//Se implementan a trav�s de una interface funcional 
		//Esto nos va a permitir escribir el m�todo para su uso inmediato 
		//Sin necesidad de que el m�todo sea definido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se har�a 
		//a trav�s deuna clase an�nima 
		//la sintaxis de una expresi�n lambda es la siguiente
		//(par�metros) -> {cuerpo de la expresi�n}
		
		//Crear una instancia u objeto de una clase an�nima 
		//implementada por nuestra interface funcional
		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a + b));
		IMetodo resta = (x, y) -> System.out.println("La resta es: " + (x - y));
		
		IMetodo multiplica = (c,d) -> {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa el primer n�mero:");
			c = entrada.nextInt();
			System.out.println("Ingresa el segundo n�mero:");
			d = entrada.nextInt();
			int resultado = c * d;
			System.out.println("El resultado es: " + resultado);
		};
		
		//Una vez definidos los m�todos con las expresiones lambda
		//llamamos a los objetos y el m�todo
		
		suma.operacion(7, 5);
		
		resta.operacion(10, 5);
		
		multiplica.operacion(0, 0);

	}

}
