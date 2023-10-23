package com.arrays;

import java.util.Scanner;

public class Arrays1_GVA {

	public static void main(String[] args) {
		
		//1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner(System.in);
		
		int [] arreglo = new int [10];
		System.out.println("Ingrese 10 números: ");
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Ingrese el número en la posición " + i + ": ");
			arreglo[i] = entrada.nextInt();
			
		}

		System.out.println("Índice\tValor");
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(i + "\t" + arreglo[i]);
			
		}
		entrada.close();
	}

}
