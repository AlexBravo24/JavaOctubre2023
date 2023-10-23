package com.Array;

import java.util.Scanner;

public class Arrays1_JMC {

	public static void main(String[] args) {
//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
		
		
		
		Scanner input = new Scanner(System.in);
		int [] numeros = new int [10];

		for (int i = 0; i < numeros.length;i ++) {
			System.out.println("Ingresa el valor del indice: "+i);
			numeros[i]=input.nextInt();		
		}
		
		
		int contador=1;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("el indice "+contador+" Contiene el valor "+numeros[i]);
		contador++;
		}
		
		input.close();
	}

}
