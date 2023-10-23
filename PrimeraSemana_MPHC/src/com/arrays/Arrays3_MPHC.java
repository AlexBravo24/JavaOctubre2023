package com.arrays;

import java.util.Scanner;

public class Arrays3_MPHC {

	public static void main(String[] args) {
		//3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.

		
		Scanner entrada = new Scanner(System.in);
		  System.out.print("Ingresa una frase: ");
	        String frase = entrada.nextLine();

	        // Convertir la frase en un array de caracteres
	        char [] caracteres = frase.toCharArray();

	  
	        // Imprimir el array de caracteres
	        System.out.println("La frase convertida a un array de caracteres es:");
	        for (char i : caracteres) {
	            System.out.println(i + " ");
	        }

	}

}
