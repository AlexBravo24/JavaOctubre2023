package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ELP {

	public static void main(String[] args) {
		/*9. Programa Java que lea 
		 * dos números y muestre los números pares entre ellos
		 */
		  Scanner leer = new Scanner(System.in);

	        System.out.print("Ingresa el primer número: ");
	        int numero1 = leer.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        int numero2 = leer.nextInt();

	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        System.out.println("Los números pares entre " + menor + " y " + mayor + " son:");

	        for (int i = menor; i <= mayor; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }

	        leer.close();
	    }
	}