package com.arrays;

import java.util.Scanner;

public class Arrays3_ELP {

	public static void main(String[] args) {
		/*3. Pide al usuario por teclado una frase y pasa 
		 sus caracteres a un array de caracteres
		 */
		
		Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = leer.nextLine();

        // Convierte la frase en un array de caracteres
        char[] caracteres = frase.toCharArray();

        System.out.println("La frase convertida en un array de caracteres es:");
        for (char caracter : caracteres) {
            System.out.print(caracter + " ");
        }
    }
}
