package com.condicionales;

import java.util.Scanner;

public class Condicionales9_EGG {

	public static void main(String[] args) {
		//Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si 
		//introducimos otro n�mero nos da un error.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el d�a de la Semana");
		int dia = entrada.nextInt();
		if (dia >= 1 && dia <= 7) {
			switch (dia) {
			case 1:
				System.out.println("LUNES");
				break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MIERCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("S�BADO");
				break;
			case 7:
				System.out.println("DOMINGO");
				break;

			default:
				break;
			}
		}else {
			System.out.println("ERROR");
		}
		
	}
}
