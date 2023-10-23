package com.bucles;

import java.util.Scanner;

public class Bucles4_MASE {
	public static void main(String[] args) {
		// #4
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		
		System.out.println("Ingresa una frase");
        String frase = entrada.next();
         
         System.out.println("Ingresa una letra ");
        char letra= entrada.next().charAt(0);
        
        entrada.close();
        
        //
        
        int c = contarLetraEnFrase(frase, letra);

        // Verificar si la letra se encontró en la frase
        if (c > 0) {
            System.out.println("La letra '" + letra + "' aparece " + c + " veces en la frase.");
        } else {
            System.out.println("Carácter no encontrado.");
        }
    }

    // Función para contar la cantidad de veces que aparece una letra en una frase
    public static int contarLetraEnFrase(String frase, char letra) {
        int conteo = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                conteo++;
            }
        }
        return conteo;
    





        
 
        
    }
}
