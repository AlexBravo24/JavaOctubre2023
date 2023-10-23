package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AAMH {

	public static void main(String[] args) {
		//4.Realiza un programa que lea una cadena por teclado
		//y compruebe si es una letra mayúscula.

		Scanner scanner = new Scanner (System.in);
		String cadena;
		
		System.out.println("Lee una cadena y comprueba si es una letra mayuscula");
		System.out.println("Introduce la cadena que desees");
		cadena = scanner.nextLine();
		
		if (cadena.length() != 1) {
			System.out.println("La cadena no es una letra mayuscula");
			
		}else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <=0)) {
			System.out.println("La cadena es una letra mayuscula.");
			
		}else {
			System.out.println("La cadena no es una letra mayuscula.");                                                                                                                                         
	}		
	}
	
}
