package com.ciclos;

import java.util.Scanner;

public class Ciclos8_ELP {

	public static void main(String[] args) {
		/*
		 8. Programa Java que lea dos números y muestre los números desde el menor hasta el 
		 mayor 
		 */
		
		   Scanner leer = new Scanner(System.in);

	        System.out.print("Ingresa el primer número: ");
	        int numero1 = leer.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        int numero2 = leer.nextInt();

	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        System.out.println("Los números desde el menor hasta el mayor son:");

	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }

	        leer.close();
	    }
	}