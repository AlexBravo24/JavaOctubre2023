package com.arrays;

import java.util.Scanner;

public class Arrays1_MPHC {

	public static void main(String[] args) {

//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
		Scanner entrada = new Scanner(System.in);
		int[] numeros2 = new int[10];
		
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posicion:" + i);
			numeros2[i] = entrada.nextInt();
				
		}
		
		System.out.println("<<< Resumen de numeros ingresados >>>");
		for (int i = 0; i < numeros2.length; i++) {	
			System.out.println(i+"."+" "+numeros2[i]);
			
		}
	
	}

}
