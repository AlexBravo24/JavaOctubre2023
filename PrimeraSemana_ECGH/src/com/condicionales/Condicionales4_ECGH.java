package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ECGH {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		String cadena;
		Scanner entrada= new Scanner (System.in);
		System.out.println("Ingresa letra");
		cadena=entrada.next();
		
		 if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0)))
		 {
			 
			 System.out.println("Es may�scula");
		 }
		 
		 else {
			 System.out.println("No es may�scula");
		 }
		entrada.close();
		
		
		

	}

}
