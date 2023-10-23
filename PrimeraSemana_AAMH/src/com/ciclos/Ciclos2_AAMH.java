package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AAMH {

	private static Scanner scanner;

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar
		//de un numero introducido desde teclado,
		//hasta la iteración deseada por el usuario.
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
      
		scanner = new Scanner (System.in);
		int n;
		System.out.print("Introduce un número entero: ");
		n = scanner.nextInt();
		System.out.println("Tabla del " + n);
		for(int i = 1; i<=95; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		

	}
}