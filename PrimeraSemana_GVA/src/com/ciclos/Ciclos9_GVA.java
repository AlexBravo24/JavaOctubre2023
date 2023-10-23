package com.ciclos;

import java.util.Scanner;

public class Ciclos9_GVA {

	public static void main(String[] args) {
		
		//9. Programa Java que lea dos números y muestre los números pares entre ellos.

		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Encuentra el número menor y mayor
        int menor, mayor;
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        } else {
            menor = numero2;
            mayor = numero1;
        }

        // Muestra los números pares entre el menor y el mayor
        System.out.println("Números pares entre " + menor + " y " + mayor + ":");
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
	}

}
