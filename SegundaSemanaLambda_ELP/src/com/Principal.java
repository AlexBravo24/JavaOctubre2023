package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		//Expresiones Lambda
		//Son expresiones o funciones anonimas
		//Que se implementan a través de una interface funcional
		//Esto nos va a permitir escribir el método para su uso inmediato
		//Sin necesidad de que el método sea definido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se haría
		//a través de una clase anónima
		//La sintaxis de una expresion lamda es la siguiente
		//(parametro) -> {cuerpo de la expresion}
		
		//Crear una instancia u objeto de una clase anonima
		//implementada por nuestra interface funcional
		IMetodo suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		IMetodo resta = (x, y) -> System.out.println("La resta es " +(x-y));
		
		IMetodo multiplica = (c, d) -> {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa el primer numero");
			c=entrada.nextInt();
			System.out.println("Ingresa el segundo numero");
			d=entrada.nextInt();
			int resultado=c*d;
			System.out.println("El resultado es; " + resultado);
			
		};
		
		//int x; int y;
		//Una vez definido los métodos con las expresiones lambda
		//llamamos a los objetos y el metodo
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
	
		multiplica.operacion(0, 0);

	}

}
