package com;


import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos
		// Utilizar clase Scanner
		
		Scanner entrada = new Scanner(System.in);
	
		int numero;
		System.out.println("Introduce un numero");
		numero = entrada.nextInt();
		
		
		System.out.println("Introduce un numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("El suma es:"+(numero+numero2));
		

		
		String nombre;
		
		System.out.println("Introduce tu nombre");
		entrada.nextLine();
		nombre=entrada.nextLine();
		
		System.out.println("Tu nombre es:"+ nombre);
//		
//		//operador de modulo - sirve para indicar el valor de residuo de una division 
//		
		
		int n=10;
		int divisor=2;
		// el operador modulo "%" deviuelve el valor del residuo de la division
		int resultado= n%divisor;
		
		
		System.out.println(resultado);
		
		

	

	}

}
