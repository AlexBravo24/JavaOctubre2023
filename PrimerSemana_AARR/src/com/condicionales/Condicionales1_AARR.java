package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AARR {

		public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("ingrese valor A");
		A = entrada.nextInt();
		
		System.out.println("ingrese el valor de B");
		B = entrada.nextInt();
		
		if (A>B) {
			System.out.println("A es mayor que B");
		}else if(A==B) {
			System.out.println("A y B son iguales");
		}else {
			System.out.println("A es menor que B");
		}

	}
}
