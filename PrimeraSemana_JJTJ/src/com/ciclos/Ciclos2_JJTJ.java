package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
		 * hasta la iteración deseada por el usuario.
		 *  Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 * 
		 * */
		Scanner entrada = new Scanner(System.in);
        
		int num1;
		int num2;
		 System.out.println("Ingrese el primer numero");
		 num1=entrada.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 num2=entrada.nextInt();
		 
		 for(int i = 0; i<=num2 ; i++) 
			
		 {
			
			 System.out.println("La multuplicacion de: " + num1 + " Por " + i + " Es: " + i * num1);
		 }
	}

}
