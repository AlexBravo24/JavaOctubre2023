package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EGG {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un n�mero");
		
		numero = entrada.nextInt();
		numero = numero%2;
		
		if (numero == 0) {
			System.out.println("Es un n�mero par");
		}else {
			System.out.println("Es un n�mero impar");
		}

	}

}
