package com.arrays;

public class Arrays2_MPHC {

	public static void main(String[] args) {
		// 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
	//	1 al 100. Obt�n la suma de todos ellos y la media.
		
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

        System.out.println("La suma de n�meros es: " + suma);
        System.out.println("La media de los n�meros es: " + media);

	}

}
