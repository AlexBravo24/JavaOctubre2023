package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MASE {

	public static void main(String[] args) {

		/*1.Realiza un programa que reciba
		 *  dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		
		System.out.println("Ingresa el primer n�mero");
		a = entrada.nextInt();
		
		System.out.println("Ingresa el segundo n�mero");
		b = entrada.nextInt();
		
		if(a<b) {
			System.out.println(a + "  es menor que " + b);
		}else if(a>b) {
			System.out.println(a + "  es mayor que " + b);
		}else{
			System.out.println("ambos numeros son iguales" + a);
		}
		
		
		
		
		
	}

}
