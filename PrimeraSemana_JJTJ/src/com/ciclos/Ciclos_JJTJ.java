package com.ciclos;

import java.util.Scanner;

public class Ciclos_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa que reciba una frase y una letra por teclado.
		 *  Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
		 * Si no existe, imprimir un mensaje “Carácter no encontrado”.
		 * */

		Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = entrada.nextLine();

        System.out.print("Introduce una letra: ");
        char letra = entrada.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
        
	}

}
