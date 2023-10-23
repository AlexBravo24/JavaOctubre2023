package com.arrays;

public class Arrays2_ELP {

	public static void main(String[] args) {
		/*2. Crea un array de n�meros de 100 posiciones,
		 que contendr� los n�meros del 
		 1 al 100. Obt�n la suma de todos ellos y la media.
		 */

		int[] numeros = new int[100];
		
		// Llenar el array con n�meros del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        int suma = 0;

        // Calcular la suma de los elementos del array
        for (int i = 0; i < 100; i++) {
            suma += numeros[i];
        }

        double media = (double) suma / 100;

        System.out.println("La suma de los n�meros es: " + suma);
        System.out.println("La media de los n�meros es: " + media);
    }
}