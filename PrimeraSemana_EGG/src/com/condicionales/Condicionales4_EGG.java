package com.condicionales;

import java.util.Scanner;

public class Condicionales4_EGG {
	public static void main(String[] args) {
	//  Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
			Scanner entrada = new Scanner(System.in);
			
			char letra;
			
			System.out.print("Introduce una letra: ");
	        letra = entrada.next().charAt(0);

	        if (Character.isUpperCase(letra)) {
	            System.out.println("La letra ingresada es mayúscula.");
	        } else {
	            System.out.println("La letra ingresada no es mayúscula.");
	        }

	}

}
