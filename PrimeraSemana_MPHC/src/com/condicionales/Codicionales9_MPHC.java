package com.condicionales;

import java.util.Scanner;

public class Codicionales9_MPHC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< Dias de la semana "
				+ ">>>");
		System.out.println("");
		System.out.println("Ingrese dia de la semana del 1 al 7");
		int dia = entrada.nextInt();

		if (dia == 1) {
			System.out.println("Dia: Lunes");

		} else if (dia == 2) {

			System.out.println("Dia: Martes");

		} else if (dia == 3) {
			System.out.println("Dia:Miercoles");

		} else if (dia == 4) {
			System.out.println("Dia: Jueves");

		} else if (dia == 5) {
			System.out.println("Dia: Viernes");
		} else if (dia == 6) {
			System.out.println("Dia: Sabado");

		} else if (dia == 7) {
			System.out.println("Dia: Domingo");

		} else {
			System.out.println("Error de dia");
		}

	}

}
