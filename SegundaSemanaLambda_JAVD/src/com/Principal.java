package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son expresiones o funciones anónimas
		//Que se implementan a través de una interfaz funcional
		//Esto nos va a permitir escribir el método para su uso inmediato
		//Sin necesidad de que el método sea definido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se haría
		//a través de una clase anónima
		//La sintáxis de una expresión lalmbda es la siguente
		//(parametros) -> {cuerpo de la expresión}
		
		//Crear una instancia u objeto de una clase anónima
		//implementada por nuestra interface funcional
		IMetodo suma = (a,b) -> System.out.println("La suma es: "+(a+b));
		IMetodo resta = (x,y) -> System.out.println("La resta es: "+(x-y));
		IMetodo multi = (c,d) -> {
			Scanner in = new Scanner(System.in);
			System.out.println("Ingresar el primer número:");
			c=in.nextInt();
			System.out.println("Ingresar el segundo número:");
			d=in.nextInt();
			int result = c*d;
			System.out.println("El resultado es: "+result);
		};
		
		//int x; int y;
		//Una vez definidos los métodos con las expresiones lambda
		//llamamos a los objetos y el método
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
		
		multi.operacion(0, 0);

	}

}
