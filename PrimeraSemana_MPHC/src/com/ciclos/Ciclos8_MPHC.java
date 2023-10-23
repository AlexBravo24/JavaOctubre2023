package com.ciclos;

import java.util.Scanner;

public class Ciclos8_MPHC {

	public static void main(String[] args) {
		// 8. Programa Java que lea dos números y muestre los números desde el menor hasta el 
		//mayor
		
		
		  Scanner entrada = new Scanner(System.in);

	        System.out.print("Ingresa el primer número: ");
	        int numero1 = entrada.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        int numero2 = entrada.nextInt();

	        // Asegurarse de que numero1 sea menor que numero2
	        if (numero1 > numero2) {
	            int temp = numero1;
	            numero1 = numero2;
	            numero2 = temp;
	        }

	        System.out.println("Números de menor a mayor entre " + numero1 + " y " + numero2 + ":");

	        int actual = numero1;
	        while (actual <= numero2) {
	            System.out.print(actual + " ");
	            actual++;
	        }

	}

}
