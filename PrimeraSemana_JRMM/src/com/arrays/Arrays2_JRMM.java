package com.arrays;

public class Arrays2_JRMM {

	public static void main(String[] args) {
		
		// Crea un array de n�meros de 100 posiciones,
		//que contendr� los n�meros del 1 al 100.
		//Obt�n la suma de todos ellos y la media.

		int numeros [] = new int[100];
		double suma = 0, media;
		
		for(int i = 1; i <=100; i++) {
			suma = suma + i;
		}
		media = suma / numeros.length;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: "+ media);

	}

}
