package com.arrays;

import java.util.Scanner;

public class Arrays3_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray(); //para convertirlo en array

        System.out.println("array de caracteres:");

        for (char c : caracteres) {
            System.out.print(c + " ");
        }
	}

}
