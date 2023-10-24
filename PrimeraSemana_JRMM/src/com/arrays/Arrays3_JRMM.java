package com.arrays;

import java.util.Scanner;

public class Arrays3_JRMM {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres
		//a un array de caracteres.
		
		Scanner entrada = new Scanner(System.in);
		
		String frase = "";
		
		System.out.println("Introduce una frase: ");
		frase = entrada.nextLine();
		
		char [] palabra = frase.toCharArray();
		
		for(int i = 0; i < palabra.length; i++) {
			System.out.println(palabra[i]);
		}
		

	}

}
