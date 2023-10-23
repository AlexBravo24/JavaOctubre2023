package com.arrays;

public class Arrays2_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
		 *  Obtén la suma de todos ellos y la media.
		 * */
		int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de los números en el array
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Imprimir la suma y la media
        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);

	}

}
