package com.arrays;

import java.util.Scanner;

public class Arrays1_EGG {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		Scanner sc = new Scanner(System.in);
		int [] array = new int [10];
		
		for (int i=0; i<array.length ;i++) {
			System.out.println("Ingresa un numero: " + i);
			array [i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Índice \t Valor");
		for (int i=0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
			
		}
		
	}

}
