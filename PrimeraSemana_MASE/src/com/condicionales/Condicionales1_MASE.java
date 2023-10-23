package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MASE {

	public static void main(String[] args) {

		/*1.Realiza un programa que reciba
		 *  dos números por teclado e indique cuál es mayor o si son iguales.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		
		System.out.println("Ingresa el primer nùmero");
		a = entrada.nextInt();
		
		System.out.println("Ingresa el segundo nùmero");
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
