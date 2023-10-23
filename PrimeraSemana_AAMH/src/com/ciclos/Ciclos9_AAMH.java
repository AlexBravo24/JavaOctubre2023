package com.ciclos;

import java.util.Scanner;

public class Ciclos9_AAMH {

	public static void main(String[] args) {
		//9. Programa Java que lea dos n�meros y 
		//muestre los n�meros pares entre ellos

		Scanner entrada = new Scanner(System.in);
        int A, B;

        //Lectura de dos n�meros enteros A Y B
        //A debe ser menor que B
        do {
            System.out.print("Introduce un n�mero entero: ");
            A = entrada.nextInt();
            System.out.print("Introduce otro n�mero entero mayor que el anterior: ");
            B = entrada.nextInt();
            if (A >= B) {
                System.out.println("El segundo n�mero debe ser mayor que el primero");                  
            }
        } while (A >= B);


        //Mostrar los n�meros pares entre A y B.
        System.out.println("\nN�meros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
	}

}
