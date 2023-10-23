package com.ciclos;

import java.util.Scanner;

public class Ciclos10_ELP {

	public static void main(String[] args) {
		/*10. Programa que lea 20 números e indique si son
		  positivos o negativos y pares o 
         impares y además muestre la sumatoria de los positivos y 
		 sumatoria de los impares.
		 */
		Scanner leer = new Scanner(System.in);
        
        int positivosSuma = 0;
        int imparesSuma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = leer.nextInt();

            if (numero > 0) {
                System.out.println("El número es positivo.");
                positivosSuma += numero;
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
                imparesSuma += numero;
            }
        }

        System.out.println("La sumatoria de los números positivos es: " + positivosSuma);
        System.out.println("La sumatoria de los números impares es: " + imparesSuma);

        leer.close();
    }
}