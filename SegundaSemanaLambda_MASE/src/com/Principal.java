package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		// Expresiones Lambda
		//Son expresiones o funciones anonimas
		//Que se implementan aa travè de una interface funcional
		//Esto nos va a permitir el metodo para su uso inmediato
		//Sin necesidaad de que el metodo sea definido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se haria 
		//a travès de una clase anònima
		//La sintaxis de una expresion lambda es la siguiente
		//(parametros )-> cuerpo de la exp
		
		//Crear una instancia u objeto de una clase anonima 
		//implementada por nuestra interface funcional
		
		IMetodos suma = (a,b) -> System.out.println("la suma es: "+ (a+b));
		IMetodos resta = (x,y) -> System.out.println("la resta es: "+ (x-y));
		
		IMetodos multiplica =(c,d)-> {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa el primer numero");
			c=entrada.nextInt();
			System.out.println("Ingresa el segundo numero");
			d=entrada.nextInt();
			int resultados=c*d;
			System.out.println("el resultado es; "+ resultados);
		};
		//Una vez definidos los metodos con las expresiones lambda
		//LLamamos a los objetos y metodos
		
		suma.operacion(10,50);
		resta.operacion(65,15);
		multiplica.operacion(0, 0);
	}

}
