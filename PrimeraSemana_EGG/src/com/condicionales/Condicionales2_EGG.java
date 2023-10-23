package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EGG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número");
		
		numero = entrada.nextInt();
		numero = numero%2;
		
		if (numero == 0) {
			System.out.println("Es un número par");
		}else {
			System.out.println("Es un número impar");
		}

	}

}
