package com.arrays;

public class Arrays2_RVV {

	public static void main(String[] args) {
		int[]numeros=new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
		}
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		double media =(double) suma/ numeros.length;
		System.out.println("Numeros: "+numeros.length);
		System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
	}

}
