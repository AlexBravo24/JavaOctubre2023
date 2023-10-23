package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JJTJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Programa que lea 20 n�meros e indique si son positivos o negativos y pares o impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares.
		 * 
		 * */
		   Scanner scanner = new Scanner(System.in);
	        int positivos = 0;
	        int impares = 0;

	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Ingrese el n�mero #" + i + ": ");
	            int numero = scanner.nextInt();

	            if (numero > 0) {
	                System.out.println("Es un n�mero positivo.");
	                positivos += numero;
	            } else if (numero < 0) {
	                System.out.println("Es un n�mero negativo.");
	            } else {
	                System.out.println("Es cero.");
	            }

	            if (numero % 2 != 0) {
	                System.out.println("Es un n�mero impar.");
	                impares += numero;
	            } else {
	                System.out.println("Es un n�mero par.");
	            }
	        }

	        System.out.println("La sumatoria de los n�meros positivos es: " + positivos);
	        System.out.println("La sumatoria de los n�meros impares es: " + impares);
	}

}
