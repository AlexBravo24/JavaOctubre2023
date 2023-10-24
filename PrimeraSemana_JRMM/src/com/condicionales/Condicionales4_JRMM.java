package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JRMM {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		Scanner entrada = new Scanner (System.in);
		
		String vocal;
		
		System.out.println("Inserte una vocal: ");
		vocal = entrada.nextLine();
		
		if(vocal.equals("A") || vocal.equals("E") || vocal.equals("I") ||
				vocal.equals("O") || vocal.equals("U")) {
			System.out.println("La vocal escrita es mayuscula");
		}else {
			System.out.println("No es vocal y/o no es mayuscula");
		}
		
		

	}

}
