package com.ciclos;

import java.util.Scanner;


public class Ciclos9_MPHC {

	public static void main(String[] args) {
		//9. Programa Java que lea dos números y muestre los números pares entre ellos
		
		 Scanner entrada = new Scanner(System.in);

	        System.out.print("Ingresa un número: ");
	        int numero1 = entrada.nextInt();

	        System.out.print("Ingresa otro número: ");
	        int numero2 = entrada.nextInt();

	        // Asegurarse de que numero1 sea menor que numero2
	        if (numero1 > numero2) {
	            int temp = numero1;
	            numero1 = numero2;
	            numero2 = temp;
	        }

	        System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");

	        for (int i = numero1; i <= numero2; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }

	  
		
		
		
		
		

	}

}
