package com.ciclos;

import java.util.Scanner;

public class Ciclos3_MPHC {

	// 3. Realiza un programa para determinar si un String es palíndromo.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una cadena: ");
		String cadena = scanner.nextLine();
		scanner.close();

		cadena = cadena.replaceAll(" ", "").toLowerCase();
		System.out.println(cadena);

		int longitud = cadena.length();

		for (int i = 0; i < longitud / 2; i++) {

			if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
				System.out.println("La cadena no es palíndromo.");

			} else {

				System.out.println("La cadena es un palíndromo.");

			}
			break;

		}

	}

}
