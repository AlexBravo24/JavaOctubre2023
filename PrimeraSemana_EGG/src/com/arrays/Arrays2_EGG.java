package com.arrays;

public class Arrays2_EGG {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del 
		// 1 al 100. Obtén la suma de todos ellos y la media.
		
		int [] numeros = new int [100];
		int input = 1, c = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = input;
			c = c + input;
			input++;
		}
		double m = c/numeros.length + 0.5;
		System.out.println("La suma de los números es: " + c);
		System.out.println("La media es: " + m);

	}

}
