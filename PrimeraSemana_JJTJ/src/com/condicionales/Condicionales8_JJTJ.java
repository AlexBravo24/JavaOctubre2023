package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras
		 *  y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		 *  Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 *   Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.
		 * 
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		int resultado;
		System.out.println("introduce el resultado");
		 resultado=entrada.nextInt();
		  if(resultado== 1) {
			  System.out.println("La cara opuesta es Seis"); 
		  }else if(resultado== 2){
			  System.out.println("La cara opuesta es Cinco"); 
		  }else if(resultado== 3) {
			  System.out.println("La cara opuesta es Cuatro"); 
		  }else if(resultado== 4) {
			  System.out.println("La cara opuesta es Tres"); 
		  }else if(resultado== 5) {
			  System.out.println("La cara opuesta es Dos"); 
		  }else if(resultado==6) {
			  System.out.println("La cara opuesta es Uno"); 
		  }else {
			  System.out.println("El numero es incorrecto ingrese un numero entre 1 a 6"); 
		  }
	}

}
