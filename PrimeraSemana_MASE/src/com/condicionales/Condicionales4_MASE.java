package com.condicionales;

import java.util.Scanner;

public class Condicionales4_MASE {
	public static void main(String[] args) {
		
		//4. Realiza un programa que 
		//lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		Scanner entrada = new Scanner(System.in);
		
        char cadena;
		System.out.println("Introduce una frase");
		cadena = entrada.next().charAt(0);
		
		if(cadena>='A'&&cadena<='Z') {
			 System.out.println("La frase es una letra mayuscula");
		}else {
			    System.out.println("La cadena no  es una letra mayúscula.");
			    }
			
		}
		
		
		
		
		
	}


