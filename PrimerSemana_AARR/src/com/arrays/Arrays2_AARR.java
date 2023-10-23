package com.arrays;

import java.util.Scanner;

public class Arrays2_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [] numeros = new int [99];
		int suma = 0;
		double media;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
		}
		for (int i = 0; i < numeros.length; i++) {
			suma=suma+numeros[i];
		}
		media = suma/(numeros.length+1);
		System.out.println("la suma de los numeros es: "+suma);
		System.out.println("la media de los numeros es: "+media);
	}

}
