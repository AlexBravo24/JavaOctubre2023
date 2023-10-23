package com.ciclos;

import java.util.Scanner;

public class Ciclos4_EGG {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		//“Carácter no encontrado”.
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		char letra;
		
		System.out.println("Introduce una frase");
		frase = entrada.nextLine();
		System.out.println("Introduce una Letra");
		letra = entrada.next().charAt(0);
		
		int contador = 0;
		int posicion = 0;
		
		while (posicion < frase.length()) {
			if (frase.charAt(posicion) == letra) {
				contador++;
			}
			posicion++;
		}
		
		if (contador > 0) {
			System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase");
		}else {
			System.out.println("Carácter no encontrado");
		}
		
	}

}
