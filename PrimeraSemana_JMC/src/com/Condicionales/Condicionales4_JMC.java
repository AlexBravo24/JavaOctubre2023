package com.Condicionales;

import java.util.Scanner;

public class Condicionales4_JMC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		Scanner entrada4 = new Scanner(System.in);
		char cadena;
		
		System.out.println("Introduce una cadena");
		cadena = entrada4.next().charAt(0);
		
		if (Character.isUpperCase(cadena)) {
		    System.out.println(cadena + " es una letra mayúscula");
		} else {
		    System.out.println(cadena + " no es una letra mayúscula");
		}

			
		}
		
	}


