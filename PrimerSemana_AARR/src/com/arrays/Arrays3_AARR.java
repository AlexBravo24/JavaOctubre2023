package com.arrays;

import java.util.Scanner;

public class Arrays3_AARR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String frase;
		
		System.out.println("ingrese una frase");
		frase=entrada.next();
		
		char [] caracteres = new char[frase.length()];
		for (int i = 0; i < caracteres.length; i++) {
			caracteres[i]=frase.charAt(i);
		}
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i]+" ");
		}
	}
}
