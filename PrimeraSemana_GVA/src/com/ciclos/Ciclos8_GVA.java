package com.ciclos;

import java.util.Scanner;

public class Ciclos8_GVA {

	public static void main(String[] args) {
		
		//8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor
		
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

        // Muestra los números desde el menor hasta el mayor
        System.out.println("Números desde el menor hasta el mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
	}

}
