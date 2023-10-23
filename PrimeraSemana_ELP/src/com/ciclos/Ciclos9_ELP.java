package com.ciclos;

import java.util.Scanner;

public class Ciclos9_ELP {

	public static void main(String[] args) {
		/*9. Programa Java que lea 
		 * dos n�meros y muestre los n�meros pares entre ellos
		 */
		  Scanner leer = new Scanner(System.in);

	        System.out.print("Ingresa el primer n�mero: ");
	        int numero1 = leer.nextInt();

	        System.out.print("Ingresa el segundo n�mero: ");
	        int numero2 = leer.nextInt();

	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        System.out.println("Los n�meros pares entre " + menor + " y " + mayor + " son:");

	        for (int i = menor; i <= mayor; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }

	        leer.close();
	    }
	}