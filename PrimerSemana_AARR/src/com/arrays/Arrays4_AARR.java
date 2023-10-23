package com.arrays;

import java.util.Scanner;

public class Arrays4_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int [] numeros = {1,2,3,4,5};
		int [] numeros2 = new int[numeros.length];
		
		int a=0;
		for (int i = 4; i > numeros.length; i--) {
			numeros2[a]=numeros[i];
			a++;
			
		}
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]);
		}
	}

}
