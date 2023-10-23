package com.ciclos;

import java.util.Scanner;

public class Ciclos10_RVV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorImpares = 0;
        int sumaPositivos = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingresa el n�mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Es positivo.");
                contadorPositivos++;
                sumaPositivos += numero;
            } else if (numero < 0) {
                System.out.println("Es negativo.");
            } else {
                System.out.println("Es cero.");
            }

            if (numero % 2 != 0) {
                System.out.println("Es impar.");
                contadorImpares++;
                sumaImpares += numero;
            } else {
                System.out.println("Es par.");
            }
        }

        System.out.println("Resumen:");
        System.out.println("Total de n�meros positivos: " + contadorPositivos);
        System.out.println("Suma de n�meros positivos: " + sumaPositivos);
        System.out.println("Total de n�meros impares: " + contadorImpares);
        System.out.println("Suma de n�meros impares: " + sumaImpares);

	}

}
