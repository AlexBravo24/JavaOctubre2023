package com.arrays;

public class Arrays2_EGG {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		// 1 al 100. Obt�n la suma de todos ellos y la media.
		
		int [] numeros = new int [100];
		int input = 1, c = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = input;
			c = c + input;
			input++;
		}
		double m = c/numeros.length + 0.5;
		System.out.println("La suma de los n�meros es: " + c);
		System.out.println("La media es: " + m);

	}

}
