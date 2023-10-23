package com.condicionales;

import java.io.IOException;
import java.util.Scanner;

public class Condicionales4_AARR {

	public static void main(String[] args)  {

		Scanner entrada = new Scanner(System.in);
		String caracter;
		
		System.out.println("ingrese un caracter");
		caracter = entrada.nextLine();
		
		if (esMayuscula(caracter)) {
			System.out.println("May�scula");	
			
		} else if (esMinuscula(caracter)) {
			System.out.println("Min�scula");
		}

	}
	public static boolean esMayuscula(String s) {
		// Regresa el resultado de comparar la original con su versi�n may�scula
		return s.equals(s.toUpperCase());
	}

	public static boolean esMinuscula(String s) {
		// Regresa el resultado de comparar la original con su versi�n min�scula
		return s.equals(s.toLowerCase());
	}

}
