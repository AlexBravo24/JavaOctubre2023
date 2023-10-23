package com.arrays;

public class Arrays2_MPHC {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del 
	//	1 al 100. Obtén la suma de todos ellos y la media.
		
		int[] numeros=new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			
		numeros[i]=i+1;
			
		}
	    int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / 5;

        System.out.println("La suma de números es: " + suma);
        System.out.println("La media de los números es: " + media);

	}

}
