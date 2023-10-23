package com.condicionales;

import java.util.Scanner;

public class Condicional10_MPHC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("<<< meses del año >>>");
		System.out.println("");
		System.out.println("Ingrese mes del 1 al 12");
		int mes = entrada.nextInt();

		if (mes == 1) {
			System.out.println("mes:Enero");

		} else if (mes == 2) {

			System.out.println("mes:Febrero");

		} else if (mes == 3) {
			System.out.println("mes:Marzo");

		} else if (mes == 4) {
			System.out.println("mes:Abril");

		} else if (mes == 5) {
			System.out.println("mes:Mayo");
			
		} else if (mes == 6) {
			System.out.println("mes:Junio");

		} else if (mes == 7) {
			System.out.println("mes:Julio");
			
		} else if (mes == 8) {
			System.out.println("mes:Agosto");
			
		} else if (mes == 9) {
			System.out.println("mes:Septiembre");
			
		} else if (mes == 10) {
			System.out.println("mes:Octubre");
			
		} else if (mes == 11) {
			System.out.println("mes:Noviembre");
			
		} else if (mes == 12) {
			System.out.println("mes:Diciembre");

		} else {
			System.out.println("Error, Ingrese mes del 1 al 12");
		}

	}

}
