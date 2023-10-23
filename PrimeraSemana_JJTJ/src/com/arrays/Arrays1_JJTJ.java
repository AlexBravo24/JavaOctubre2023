package com.arrays;
import java.util.Scanner;

public class Arrays1_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Crear un array de 10 posiciones
        int[] numeros = new int[10];

        System.out.println("Ingresa 10 números:");

        // Solicitar valores al usuario y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el índice y el valor correspondiente
        System.out.println("Índice - Valor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

	}

}
