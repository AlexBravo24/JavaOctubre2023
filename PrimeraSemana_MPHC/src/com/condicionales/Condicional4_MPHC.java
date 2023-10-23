package com.condicionales;

import java.util.Scanner;

public class Condicional4_MPHC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String cadena;

		System.out.println("Ingrese una letra");
		cadena = entrada.nextLine();

		if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z") <= 0)) {
			System.out.println("La cadena es una letra mayúscula.");
		} else {
			System.out.println("La cadena es una letra minuscula.");
		}

	}

}
