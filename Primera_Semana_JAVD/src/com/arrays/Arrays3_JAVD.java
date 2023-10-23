
//Pide al usuario por teclado una frase y pasa sus caracteres a un array de
//caracteres.

package com.arrays;

import java.util.Scanner;

public class Arrays3_JAVD {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String frase;		
		
		System.out.println("Ingresa una Frase:");
		frase=in.nextLine();
		
		char [] caract = frase.toCharArray();
		
		System.out.println("La frase en un array de caracteres: ");
		for(char c: caract) {
			System.out.print(c+" ");
		}

	}

}