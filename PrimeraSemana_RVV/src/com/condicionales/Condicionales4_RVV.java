package com.condicionales;

import java.util.Scanner;

public class Condicionales4_RVV {

	private static final String Scanner = null;

	public static void main(String[] args) {
		System.out.println("Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.");
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Escriba una letra");
		String cadena = scanner.nextLine();
	
		if(cadena.matches(".*[A-Z].*")) {
			System.out.println("Es una letra mayuscula");
		}else {
			System.out.println("No es una mayuscula");
		}
		
		}// no entendi porque solo funciona si utilizo Scanner scanner
	//intente varias cosas pero solo funciono asi porque de otra forma el programa no compilaba


	

}
