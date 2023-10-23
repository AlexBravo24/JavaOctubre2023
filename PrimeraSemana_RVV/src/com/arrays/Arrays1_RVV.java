package com.arrays;

import java.util.Scanner;

public class Arrays1_RVV {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [] numeros=new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("ingresa el numero en la posicion "+i);
			numeros[i]=input.nextInt();
		}
		
		System.out.println("indice y valor correspondiente:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + ": " + numeros[i]);
        }
        
	}

}
