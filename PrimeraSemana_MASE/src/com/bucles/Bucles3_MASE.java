package com.bucles;

import java.util.Scanner;

public class Bucles3_MASE {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es pal�ndromo. 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println(cadena + " es un pal�ndromo.");
        } else {
            System.out.println(cadena + " no es un pal�ndromo.");
        }

        entrada.close();
    }

    // Funci�n para comprobar si una cadena es un pal�ndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminamos espacios en blanco y convertimos a min�sculas para ser insensible a may�sculas
        cadena = cadena.replaceAll("\\s", "").toLowerCase();
        
        int longitud = cadena.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
		

	}

}
