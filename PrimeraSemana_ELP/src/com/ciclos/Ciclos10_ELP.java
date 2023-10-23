package com.ciclos;

import java.util.Scanner;

public class Ciclos10_ELP {

	public static void main(String[] args) {
		/*10. Programa que lea 20 n�meros e indique si son
		  positivos o negativos y pares o 
         impares y adem�s muestre la sumatoria de los positivos y 
		 sumatoria de los impares.
		 */
		Scanner leer = new Scanner(System.in);
        
        int positivosSuma = 0;
        int imparesSuma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el n�mero " + i + ": ");
            int numero = leer.nextInt();

            if (numero > 0) {
                System.out.println("El n�mero es positivo.");
                positivosSuma += numero;
            } else if (numero < 0) {
                System.out.println("El n�mero es negativo.");
            } else {
                System.out.println("El n�mero es cero.");
            }

            if (numero % 2 == 0) {
                System.out.println("El n�mero es par.");
            } else {
                System.out.println("El n�mero es impar.");
                imparesSuma += numero;
            }
        }

        System.out.println("La sumatoria de los n�meros positivos es: " + positivosSuma);
        System.out.println("La sumatoria de los n�meros impares es: " + imparesSuma);

        leer.close();
    }
}