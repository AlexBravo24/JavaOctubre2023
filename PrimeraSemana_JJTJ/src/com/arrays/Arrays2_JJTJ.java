package com.arrays;

public class Arrays2_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100.
		 *  Obt�n la suma de todos ellos y la media.
		 * */
		int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de los n�meros en el array
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Imprimir la suma y la media
        System.out.println("Suma de los n�meros: " + suma);
        System.out.println("Media de los n�meros: " + media);

	}

}
