package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda
		//Son expresiones o funciones an�nimas
		//Que se implementan a trav�s de una interfaz funcional
		//Esto nos va a permitir escribir el m�todo para su uso inmediato
		//Sin necesidad de que el m�todo sea definido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se har�a
		//a trav�s de una clase an�nima
		//La sint�xis de una expresi�n lalmbda es la siguente
		//(parametros) -> {cuerpo de la expresi�n}
		
		//Crear una instancia u objeto de una clase an�nima
		//implementada por nuestra interface funcional
		IMetodo suma = (a,b) -> System.out.println("La suma es: "+(a+b));
		IMetodo resta = (x,y) -> System.out.println("La resta es: "+(x-y));
		IMetodo multi = (c,d) -> {
			Scanner in = new Scanner(System.in);
			System.out.println("Ingresar el primer n�mero:");
			c=in.nextInt();
			System.out.println("Ingresar el segundo n�mero:");
			d=in.nextInt();
			int result = c*d;
			System.out.println("El resultado es: "+result);
		};
		
		//int x; int y;
		//Una vez definidos los m�todos con las expresiones lambda
		//llamamos a los objetos y el m�todo
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
		
		multi.operacion(0, 0);

	}

}
