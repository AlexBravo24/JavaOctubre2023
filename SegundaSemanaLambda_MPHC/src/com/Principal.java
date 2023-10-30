package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Expresiones lambda
		// Son conocida como expreciones o funciones anonimas que se implementan a tra
		// ves de una interfazz funcional
		//Esto nos va a permitir escribir el metodo para su uso inmediato
		//Sin necesidad de que el metodo sea difinido por una clase
		
		//Las interfaces no pueden instanciarse, por lo que se haria a travez de una clase anonima
		//La sitaxis de una expresion lambda es la siguiente
		//(parametros)-> (cuerpo de la expresion)
		
		//Crar una istancia  u objeto de una clasee anonima
		//Implementando por nuestra interface funcional
		
		
		IMetodo suma = (a,b)->System.out.println("La suma es: " + (a + b));
		IMetodo resta = (x,y)->System.out.println("La resta es: " + (x - y));
		
		IMetodo multiplica =(c, d)->{
			 Scanner entrada = new Scanner(System.in);
			 System.out.println("Ingresa un numero");
			 c=entrada.nextInt();
			 System.out.println("Ingresa otro numero");
			 d=entrada.nextInt();
			 int resultado=c*d;
			 System.out.println("El resultado es: " + resultado);
			 
			 
			
		};
		//Una vez definidos los metodos con las expreciones lambda 
		//llamamos a los objetos y al metodo
		
		
		suma.operacion(10, 50);
		
		resta.operacion(66, 15);
		
		multiplica.operacion(0, 0);
		
		
	}

}
