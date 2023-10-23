package com.arrays;

import java.util.Scanner;

public class Arrays3_EGG {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		// caracteres.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		
		char [] caracteres = frase.toCharArray(); //Convierte la frase en un array de caracteres
		
		System.out.println("La frase en forma de array de caracteres es:");
		for (char c : caracteres) {
			System.out.println(c + " ");
		}
		sc.close();
	}

}
