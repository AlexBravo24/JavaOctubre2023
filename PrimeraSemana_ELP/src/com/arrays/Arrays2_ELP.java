package com.arrays;

public class Arrays2_ELP {

	public static void main(String[] args) {
		/*2. Crea un array de números de 100 posiciones,
		 que contendrá los números del 
		 1 al 100. Obtén la suma de todos ellos y la media.
		 */

		int[] numeros = new int[100];
		
		// Llenar el array con números del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        int suma = 0;

        // Calcular la suma de los elementos del array
        for (int i = 0; i < 100; i++) {
            suma += numeros[i];
        }

        double media = (double) suma / 100;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }
}