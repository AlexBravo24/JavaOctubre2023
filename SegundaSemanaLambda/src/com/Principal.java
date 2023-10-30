package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda 
		//Son expresiones o funciones anónimas 
		//Se implementan a través de una interface funcional 
		//Esto nos va a permitir escribir el método para su uso inmediato 
		//Sin necesidad de que el método sea definido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se haría 
		//a través deuna clase anónima 
		//la sintaxis de una expresión lambda es la siguiente
		//(parámetros) -> {cuerpo de la expresión}
		
		//Crear una instancia u objeto de una clase anónima 
		//implementada por nuestra interface funcional
		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a + b));
		IMetodo resta = (x, y) -> System.out.println("La resta es: " + (x - y));
		
		IMetodo multiplica = (c,d) -> {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa el primer número:");
			c = entrada.nextInt();
			System.out.println("Ingresa el segundo número:");
			d = entrada.nextInt();
			int resultado = c * d;
			System.out.println("El resultado es: " + resultado);
		};
		
		//Una vez definidos los métodos con las expresiones lambda
		//llamamos a los objetos y el método
		
		suma.operacion(7, 5);
		
		resta.operacion(10, 5);
		
		multiplica.operacion(0, 0);

	}

}
