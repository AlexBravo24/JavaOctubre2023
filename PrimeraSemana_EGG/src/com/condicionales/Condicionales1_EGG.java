package com.condicionales;

import java.util.Scanner;

public class Condicionales1_EGG {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer n�mero");
		a = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		b = entrada.nextInt();
		
		if (a == b) {
			System.out.println("Los dos n�meros son iguales");
		}else if (a > b) {
			System.out.println("El primer n�mero es el Mayor");
		}else {
			System.out.println("El segundo n�mero es el Mayor");
		}
		
	}

}
