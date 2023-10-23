package com.condicionales;

import java.util.Scanner;

public class Condicionales10_EGG {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		//mes correspondiente.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el mes: ");
		int mes = entrada.nextInt();
		if (mes >= 1 && mes <= 12) {
			int numerodias = 0;
			switch (mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				numerodias = 31;
				break;
			case 4: case 6: case 9: case 11:
				numerodias = 30;
				break;
			case 2:
				numerodias = 28;
				break;
				
			default:
				break;
			}
			System.out.println("El mes: "+ mes + " tiene " + numerodias + " días");
		}

	}

}
