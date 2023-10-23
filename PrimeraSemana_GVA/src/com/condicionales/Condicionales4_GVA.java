package com.condicionales;

import java.util.Scanner;

public class Condicionales4_GVA {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena 
		//por teclado y compruebe si es una letra mayúscula.
		
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Ingrese una letra: ");
		letra = entrada.charAt(0);
		
		
		if(Character.isUpperCase(letra)) {
			System.out.println("Es una letra mayúscula");
		} 
		else {
			System.out.println("Es una letra minuscula");
		}
	}

}
