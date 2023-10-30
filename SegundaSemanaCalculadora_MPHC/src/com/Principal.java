package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Cientifica operacion1 = new Cientifica("Gris", "Casio", "Pilas");
		System.out.println("<<< Calculadora >>>");
		System.out.println();

		System.out.println("Elija una opcion del 1 al 4");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		int opcion = entrada.nextInt();

		switch (opcion) {

		case 1:
			System.out.println("Calculadora. " + operacion1);
			operacion1.sumar();
			break;

		case 2:
			System.out.println("Calculadora. " + operacion1);
			operacion1.restar();
			break;

		case 3:
			System.out.println("Calculadora. " + operacion1);
			operacion1.multiplicar();
			break;

		case 4:
			System.out.println("Calculadora. " + operacion1);
			operacion1.dividir();

			break;

		}

	}

}
