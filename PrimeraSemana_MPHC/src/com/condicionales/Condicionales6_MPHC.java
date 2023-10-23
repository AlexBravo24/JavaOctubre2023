package com.condicionales;

import java.util.Scanner;

public class Condicionales6_MPHC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precio;
		String tipo;
		int tamano;
		double kilo;

		System.out.println("Ingrese precio del kilo de uva");
		precio = entrada.nextDouble();

		System.out.println("Ingrese tipo de uva");
		entrada.nextLine();
		tipo = entrada.nextLine();

		System.out.println("Ingrese tamaño de uva");
		tamano = entrada.nextInt();

		System.out.println("Ingrese los kilos");
		kilo = entrada.nextDouble();

		if (tipo.contains("A") && tamano == 1) {

			double total = kilo * precio + kilo * 0.20;

			System.out.println("Totala a pagra al productor: $" + total + " Pesos");

		} else if (tipo.contains("A") && tamano == 2) {
			double total = kilo * precio + kilo * 0.30;

			System.out.println("Totala a pagra al productor: $" + total + " Pesos");

		} else if (tipo.contains("B") && tamano == 1) {
			double total = kilo * precio - kilo * 0.30;

			System.out.println("Totala a pagra al productor: $" + total + " Pesos");
		}
		else if (tipo.contains("B") && tamano == 2) {
			double total = kilo * precio - kilo * 0.50;

			System.out.println("Totala a pagra al productor: $" + total + " Pesos");
		}else {
			System.out.println("Error al ingreesar datos");
		}

	}

}
