package com.arrays;

import java.util.Scanner;

public class Arrays1_JRMM {

	public static void main(String[] args) {
		
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		Scanner input = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa un numero en la posicion " + i + ": ");
			numeros[i]=input.nextInt();
			}
		
		System.out.println("La serie de numeros ingresados es la siguiente:");
		for(int j= 0; j < 10; j++) {
			System.out.println(j + ".- " + numeros[j]);
		}
		


	}

}
