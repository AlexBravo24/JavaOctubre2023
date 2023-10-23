package com.arrays;

import java.util.Scanner;

public class Arrays3_GVA {

	public static void main(String[] args) {
		
		//3. Pide al usuario por teclado una frase y pasa sus caracteres
		//a una array de caracteres.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese una frase: ");
		String frase = input.nextLine();
		
		char[] caracteres = new char[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
		}
		
		System.out.println("Caracteres en la frase: ");
		for (char c : caracteres) {
			System.out.print(c + " ");
		}
		
		input.close();

	}

}
