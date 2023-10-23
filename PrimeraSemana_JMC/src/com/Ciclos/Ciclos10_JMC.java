package com.Ciclos;

import java.util.Scanner;

public class Ciclos10_JMC {

	public static void main(String[] args) {
		// Programa que lea 20 números e indique si son positivos o negativos y pares o 
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares

		Scanner entrada = new Scanner(System.in);
		
		int positivosSuma = 0;
        int imparesSuma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            if (numero > 0) {
                System.out.println(numero + " es positivo.");
                positivosSuma += numero;
            } else if (numero < 0) {
                System.out.println(numero + " es negativo.");
            } else {
                System.out.println(numero + " es cero.");
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " es par.");
            } else {
                System.out.println(numero + " es impar.");
                imparesSuma += numero;
            }
        }

        System.out.println("Suma de números positivos: " + positivosSuma);
        System.out.println("Suma de números impares: " + imparesSuma);
		
	}

}
